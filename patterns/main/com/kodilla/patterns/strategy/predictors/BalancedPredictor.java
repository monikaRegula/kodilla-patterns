package com.kodilla.patterns.strategy.predictors;

import com.kodilla.patterns.strategy.BuyPredictoe;

public class BalancedPredictor implements BuyPredictoe {
    @Override
    public String predictWhatToBuy() {
        return "[Balanced Predictor ] Buy shared units of XYX";
    }
}
