package ru.stqa.pft.sandbox;

public class Point {
    public double x;
    public double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(){
        Point p1 = new Point(2,0);
        Point p2 = new Point(5,4);
        double x0 = Math.pow((p1.x-p2.x), 2);
        double y0 = Math.pow((p1.y-p2.y), 2);
        double rasst = Math.sqrt(x0 + y0);
        return (rasst);
    }
}



