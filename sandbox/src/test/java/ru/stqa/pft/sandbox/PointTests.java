package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistance() {
        Point p1 = new Point(2.0, 0.0);
        Point p2 = new Point(5.0, 4.0);
        Assert.assertEquals(p1.distance(p2), 5.0);
    }

    @Test
    public void testDistanceNegative() {
        Point p1 = new Point(-8.0, 0.0);
        Point p2 = new Point(-12.0, -3.0);
        Assert.assertEquals(p1.distance(p2), 5.0);
    }
}