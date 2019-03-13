package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;
    public boolean isExecuted;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }


    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {
       setExecuted(true);
       return  taskName + " in : "+where+" with : "+ using;
    }

    @Override
    public boolean isTaskExecuted() {
        if (getIsExecuted()==true){
            return  true;
        }else{
            return false;
        }
    }

    public boolean getIsExecuted() { return isExecuted; }

    public void setExecuted(boolean executed) { isExecuted = executed;
    }
}
