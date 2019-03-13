package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TasksFactoryTestSuite {
    @Test
    public void testFactoryTask(){
        //given
        TaskFactory factory = new TaskFactory();

        //when
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);
        System.out.println(shoppingTask.executeTask());
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);
        System.out.println(paintingTask.executeTask());
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        System.out.println(drivingTask.executeTask());

        //then
        Assert.assertEquals("shopping",shoppingTask.getTaskName());
        Assert.assertEquals(true,shoppingTask.isTaskExecuted());
        Assert.assertEquals(true,drivingTask.isTaskExecuted());
        Assert.assertEquals("painting", paintingTask.getTaskName());

    }

    @Test
    public void testIsExecuted(){
        //given
        TaskFactory factory = new TaskFactory();

        //when
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        System.out.println("Task: "+drivingTask.getTaskName() + "\nisExectued: "+drivingTask.isTaskExecuted());
        drivingTask.executeTask();
        System.out.println("executing: "+ drivingTask.executeTask());
        System.out.println("isExecuted: " + drivingTask.isTaskExecuted());
        //then
        Assert.assertEquals(true,drivingTask.isTaskExecuted());


    }
}
