package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenCoordinates0020() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenCoordinates1276() {
        double expected = 7.21;
        double out = Point.distance(1, 2, 7, 6);
        Assert.assertEquals(expected, out, 0.01);
    }
}