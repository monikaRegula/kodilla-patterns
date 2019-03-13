package com.kodilla.patterns.factory;

public class Rectangle implements Shape {
    final String name;
    final double width;
    final double length;

    public Rectangle(final String name,final double width,final double length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }


    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getCicumference() {
        return 2 * width + 2 * length;
    }

    public String getName() { return name; }

    public double getWidth() { return width; }

    public double getLength() { return length; }
}
