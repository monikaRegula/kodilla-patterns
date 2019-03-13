package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass){
        switch(taskClass){
            case SHOPPING:
                return new ShoppingTask("shopping","lemons",5.0);
            case PAINTING:
                return new PaintingTask("painting","red",2.0);
            case DRIVING:
                return new DrivingTask("driving","park","bicycle");
                default:
                    return null;
        }
    }
}
