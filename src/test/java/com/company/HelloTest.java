package com.company;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest {
    private Hello hello = new Hello();

    @Test
    public void positiveSquare() {
        Assert.assertEquals(4, hello.returnSquareInt(2));
        Assert.assertEquals(9, hello.returnSquareInt(-3));
    }

    @Test
    public void trueIsTrue() {
        Assert.assertTrue(hello.returnTrue());
    }

}
