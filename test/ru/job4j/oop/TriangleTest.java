package ru.job4j.oop;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void period() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 0);
        Point c = new Point(3, 4);
        Triangle triangle = new Triangle(a, b, c);
        double ab = a.distance(b);
        double ac = a.distance(c);
        double bc = b.distance(c);
        double rsl = triangle.period(ab, ac, bc);
        assertThat(rsl, closeTo(6, 0.001));
    }

    @Test
    public void whenExist() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        Point c = new Point(1, 2);
        Triangle triangle = new Triangle(a, b, c);
        double ab = a.distance(b);
        double ac = a.distance(c);
        double bc = b.distance(c);
        assertThat(triangle.exist(ab, ac, bc), is(true));
    }

    @Test
    public void whenNotExist() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 0);
        Point c = new Point(3, 0);
        Triangle triangle = new Triangle(a, b, c);
        double ab = a.distance(b);
        double ac = a.distance(c);
        double bc = b.distance(c);
        assertThat(triangle.exist(ab, ac, bc), is(false));
    }

    @Test
    public void area() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));
    }
}