package ru.job4j.calculator;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class X2Test {

    @Test
    public void whenBCZero() {
        /* Входные параметры. Их будет 4 штуки */
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 40;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int rsl = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenABCXOne() {
        int expected = 3;
        int rsl = X2.calc(1, 1, 1, 1);
        assertThat(rsl, is(expected));

    }

    @Test
    public void whenAZeroBCXOne() {
        int expected = 2;
        int rsl = X2.calc(0, 1, 1, 1);
        assertThat(rsl, is(expected));

    }

    @Test
    public void whenABOneCZeroXOne() {
        int expected = 2;
        int rsl = X2.calc(1, 1, 0, 1);
        assertThat(rsl, is(expected));

    }

    @Test
    public void whenABCOneXZero() {
        int expected = 1;
        int rsl = X2.calc(1, 1, 1, 0);
        assertThat(rsl, is(expected));

    }
}