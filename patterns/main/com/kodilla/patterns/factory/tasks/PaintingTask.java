package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    final String taskName;
    final String color;
    final double whatToPaint;

    public PaintingTask(final String taskName,final String color,final double whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {
       return  taskName + " color: "+color + " what to paint: "+whatToPaint;
    }

    @Override
    public boolean isTaskExecuted() {
        String result = executeTask();
        if (result != null){
            return true;
        }else{
            return false;
        }
    }
}
