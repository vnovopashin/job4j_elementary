package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CrossArrayTest {

    @Test
    public void whenHasCross() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        CrossArray.printCrossEl(
                new int[] {1, 3},
                new int[] {2, 1}
        );
        assertThat(out.toString(), is("1" + System.lineSeparator()));
    }

    @Test
    public void whenNotCross() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        CrossArray.printCrossEl(
                new int[] {1, 2},
                new int[] {3, 4}
        );
        assertThat(out.toString(), is(""));
    }

    @Test
    public void whenCrossFirstArray() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        CrossArray.printCrossEl(
                new int[] {1, 1, 2, 1},
                new int[] {3, 4}
        );
        assertThat(out.toString(), is("1" + System.lineSeparator()));
    }

    @Test
    public void whenCrossSecondArray() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        CrossArray.printCrossEl(
                new int[] {1, 2, 5},
                new int[] {3, 4, 3}
        );
        assertThat(out.toString(), is("3" + System.lineSeparator()));
    }

    @Test
    public void whenFirsArrayEmpty() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        CrossArray.printCrossEl(
                new int[] {},
                new int[] {3, 4, 3}
        );
        assertThat(out.toString(), is("3" + System.lineSeparator()));
    }

    @Test
    public void whenBothArraysEmpty() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        CrossArray.printCrossEl(
                new int[] {},
                new int[] {}
        );
        assertThat(out.toString(), is(""));
    }
}