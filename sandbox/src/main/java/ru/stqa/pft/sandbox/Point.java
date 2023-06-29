package ru.stqa.pft.sandbox;

public class Point {
    public double x;
    public double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point p){
        double x0 = Math.pow((p.x-this.x), 2);
        double y0 = Math.pow((p.y-this.y), 2);
        double rasst = Math.sqrt(x0 + y0);
        return (rasst);
    }
}



