package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void period() {
        Point a = new Point(2, -1);
        Point b = new Point(-1, 3);
        Point c = new Point(2, 7);
        double expected = 18;
        Triangle test = new Triangle(a, b, c);
        double out = test.period();
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void area() {
        Point a = new Point(2, -1);
        Point b = new Point(-1, 3);
        Point c = new Point(2, 7);
        double expected = 12;
        Triangle test = new Triangle(a, b, c);
        double out = test.area();
        Assert.assertEquals(expected, out, 0.01);
    }
}
