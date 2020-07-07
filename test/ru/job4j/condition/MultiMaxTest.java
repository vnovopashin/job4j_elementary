package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(9, 1, 2);
        assertThat(result, is(9));
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 2, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenAllMax() {
        int result = MultiMax.max(4, 4, 4);
        assertThat(result, is(4));
    }
}