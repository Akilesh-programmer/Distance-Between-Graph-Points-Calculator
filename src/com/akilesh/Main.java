package com.akilesh;

public class Main {

    public static void main(String[] args) {
        GraphPointDistanceCalculator first = new GraphPointDistanceCalculator(6, 5);
        GraphPointDistanceCalculator second = new GraphPointDistanceCalculator(3, 1);
        System.out.println("distance(0, 0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2, 2)= " + first.distance(2, 2));
        GraphPointDistanceCalculator point = new GraphPointDistanceCalculator();
        System.out.println("distance()= " + point.distance());
    }
}
