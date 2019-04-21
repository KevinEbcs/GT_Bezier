package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vertex[] anchors = new Vertex[4];
        anchors[0] = new Vertex(0,0);
        anchors[1] = new Vertex(1,1);
        anchors[2] = new Vertex(2,1);
        anchors[3] = new Vertex(2,2);
        BezierCurve curve = new BezierCurve(anchors);
        curve.findVertex(0.5);
        System.out.println(curve.findVertex(0.5));

    }
}
