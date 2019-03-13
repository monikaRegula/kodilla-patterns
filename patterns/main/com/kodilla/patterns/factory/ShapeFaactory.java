package com.kodilla.patterns.factory;

public class ShapeFaactory {
    public static final String CIRCLE = "CIRCLE";
    public static final String SQUARE = "SQUARE";
    public static final String RECTANGLE = "RECTANGLE";

    public final Shape makeShape(final String shapeClass){
        switch(shapeClass){
            case CIRCLE :
                return new Circle("circle",4.5);
            case SQUARE :
                return new Square("square",7.0);
            case RECTANGLE:
                return new Rectangle("rectangle",15.0,2.5);
            default:
                return null;
        }
    }
}
