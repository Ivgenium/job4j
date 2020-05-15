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
}
