package ru.stqa.pft.sandbox;

public class myFirstProgram {
    public static void main(String[] args) {
        Point p1 = new Point(2,0);
        Point p2 = new Point(5,4);
        System.out.println("Расстояние между точками равно "+p1.distance(p2));
    }
}