package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenManWeight187() {
        short in = 187;
        double expected = 100.05;
        double result = Fit.manWeight(in);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenWomanWeight168() {
        short in = 168;
        double expected = 66.7;
        double result = Fit.womanWeight(in);
        Assert.assertEquals(expected, result, 0.01);
    }
}