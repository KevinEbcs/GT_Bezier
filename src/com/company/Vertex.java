package com.company;

public class Vertex {
    private double[] values = new double[2];
    public Vertex(double x, double y){
        values[0] = x;
        values[1] = y;
    }

    public double getX(){
        return values[0];
    }

    public double setX(double newX){
        return values[0] = newX;
    }

    public double getY(){
        return values[1];
    }

    public double setY(double newY){
        return values[1] = newY;
    }

    @Override
    public String toString() {
        return "("+getX()+", "+getY()+")";
    }
}
