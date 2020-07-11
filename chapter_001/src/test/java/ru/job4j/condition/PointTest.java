package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        Point a = new Point(1, 1);
        Point b = new Point(4, 5);
        double expected = 5.1;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.12);
    }
    @Test
    public void distance3d() {
        Point a = new Point(1, 2,3);
        Point b = new Point(4, 5,6);
        double expected = 5.19;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.12);
    }
}
