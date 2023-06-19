package ru.stqa.pft.sandbox;

public class myFirstProgram {
    public static void main(String[] args) {
        Point p1=new Point(5,4);
        Point p2=new Point(2,8);
        System.out.println("Расстояние между точками равно "+distance(p1,p2));
    }
    public static double distance(Point p1, Point p2){
        double x0 = Math.pow((p2.x-p1.x), 2);
        double y0 = Math.pow((p2.y-p1.y), 2);
        double rasst = Math.sqrt(x0 + y0);
        return (rasst);
    }

}