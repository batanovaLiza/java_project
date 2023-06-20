package ru.stqa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Point;

public class TestPoint {
    @Test
    public void testDistance(){
        Point p1 = new Point(2,0);
        Point p2 = new Point(5,4);
        Assert.assertEquals(p1.distance(p1,p2),25.0);

        Point q1 = new Point(0,0);
        Point q2 = new Point(0,0);
        Assert.assertEquals(p1.distance(q1,q2),0.0);
    }
}
