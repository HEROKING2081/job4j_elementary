package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12K6Square44() {
        double expected = 4.4;
        int p = 12;
        double k = 6;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP16K4Square1025() {
        double expected = 10.25;
        int p = 16;
        double k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP100K25Square2f() {
        double expected = 92.45;
        int p = 100;
        double k = 25;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}