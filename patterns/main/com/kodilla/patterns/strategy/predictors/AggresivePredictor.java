package com.kodilla.patterns.strategy.predictors;

import com.kodilla.patterns.strategy.BuyPredictoe;

public class AggresivePredictor implements BuyPredictoe {
    @Override
    public String predictWhatToBuy() {
        return "[Aggresive predictor] Buy stock XYX";
    }
}
