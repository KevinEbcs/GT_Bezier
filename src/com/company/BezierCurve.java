package com.company;

public class BezierCurve {
    Vertex[] values = new Vertex[4];

    public BezierCurve(Vertex[] newValues){
       for (int i=0; i<values.length; ++i){
           values[i] = newValues[i];
       }
    }

    public Vertex findVertex(double position){
       return findVertexRec(position, values);
    }

    public Vertex findVertexRec(double position, Vertex[] vertices){
        if(vertices.length == 1) {
            return vertices[0];
        }else{
            Vertex[] verticesNew = new Vertex[vertices.length-1];
            Vertex temp;
            for (int i=vertices.length-1; i>0; --i){
                verticesNew[i-1] = VertexMath.substractVertices(vertices[i], vertices[i-1]);
                temp = VertexMath.multiplyScalar(verticesNew[i-1], position);
                verticesNew[i-1] = VertexMath.addVertices(vertices[i-1], temp);
            }
            return findVertexRec(position, verticesNew);
        }
    }
}
