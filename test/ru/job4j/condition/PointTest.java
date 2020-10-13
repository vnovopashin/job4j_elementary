package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenCoordinates0020() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenCoordinates1276() {
        Point a = new Point(1, 2);
        Point b = new Point(7, 6);
        double expected = 7.21;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}