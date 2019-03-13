package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy ;
    final double quantity;

    public ShoppingTask(final String taskName,final String whatToBuy,final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {
       return taskName + " whatto buy: " +whatToBuy+ " quantity: "+quantity;

    }

    @Override
    public boolean isTaskExecuted() {
        String result = executeTask();
        if (result != null){
            return true;
        }else{
            return  false;
        }
    }
}
