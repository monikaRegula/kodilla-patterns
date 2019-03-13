package com.kodilla.patterns.strategy;

public class Customer {
    final private String name;
    protected BuyPredictoe buyPredictoe;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String predict(){
        return buyPredictoe.predictWhatToBuy();
    }

    public void setBuyingStartegy(BuyPredictoe buyPredictoe){
        this.buyPredictoe = buyPredictoe;
    }
}
