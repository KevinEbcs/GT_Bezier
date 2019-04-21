package com.company;

public class VertexMath {
    public static Vertex addVertices(Vertex a, Vertex b){
        return new Vertex(a.getX()+b.getX(),a.getY()+b.getY());
    }

    public static Vertex substractVertices(Vertex a, Vertex b){
        return new Vertex(a.getX()-b.getX(),a.getY()-b.getY());
    }

    public static Vertex multiplyScalar(Vertex a, double scalar){
        return new Vertex (a.getX()*scalar, a.getY()*scalar);
    }
}
