package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to20then0() {
        double expected = 0;
        Point a = new Point(2, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to44then2dot82() {
        double expected = 2.82;
        Point a = new Point(2, 2);
        Point b = new Point(4, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to44then5dot65() {
        double expected = 5.65;
        Point a = new Point(0, 0);
        Point b = new Point(4, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to111then1dot73() {
        double expected = 1.73;
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 1, 1);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to000then0() {
        double expected = 0;
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to222then3dot46() {
        double expected = 3.46;
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 2, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}