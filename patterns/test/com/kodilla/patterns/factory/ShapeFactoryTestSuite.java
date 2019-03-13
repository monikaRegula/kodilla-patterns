package com.kodilla.patterns.factory;

import org.junit.Assert;
import org.junit.Test;

public class ShapeFactoryTestSuite {
    @Test
    public void testFactoryCircle(){
        //given
        ShapeFaactory shapeFaactory = new ShapeFaactory();

        //when
        Shape circle = shapeFaactory.makeShape(ShapeFaactory.CIRCLE);

        //then
        Assert.assertEquals((Math.PI * Math.pow(4.5,2)),circle.getArea(),0);
        Assert.assertEquals("circle",circle.getName());
    }
}
