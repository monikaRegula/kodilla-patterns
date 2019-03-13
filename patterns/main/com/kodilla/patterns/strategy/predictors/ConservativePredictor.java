package com.kodilla.patterns.strategy.predictors;

import com.kodilla.patterns.strategy.BuyPredictoe;

public class ConservativePredictor implements BuyPredictoe {
    @Override
    public String predictWhatToBuy() {
        return "Conservative predictor] Buy debenturesnof xxxx";
    }
}
