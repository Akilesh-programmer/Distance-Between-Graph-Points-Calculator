package com.akilesh;

public class GraphPointDistanceCalculator {
    // Fields
    private int x;
    private int y;

    public GraphPointDistanceCalculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public GraphPointDistanceCalculator() {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Calculates distance from origin.
    public double distance() {
        return (Math.sqrt((this.x * this.x) + (this.y * this.y)));
    }

    // Calculates distance between the given point and the self point.
    public double distance(int x, int y) {
        return (Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y)));
    }

    // Calculates distance between the point given in the class and the self point.
    public double distance(GraphPointDistanceCalculator point) {
        int x = point.getX();
        int y = point.getY();
        return (Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y)));
    }
}
