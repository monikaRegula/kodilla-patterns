package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.AggresivePredictor;
import org.junit.Assert;
import org.junit.Test;

public class CustomerTestSuite {
    @Test
    public void testDefaultInvestingStrategies(){
        //given
        Customer steven = new IndividualCustomer("Steven Linn");
        Customer john = new IndividualYoungCustomer("John Carter");
        Customer kodilla = new CorporateCustomer("Kodilla");

        //when
        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should buy: "+stevenShouldBuy);
        String johnShouldBuy = john.predict();
        System.out.println("John should buy: "+johnShouldBuy);
        String kodillaShouldBuy = kodilla.predict();
        System.out.println("Kosilla shoud buy: "+kodillaShouldBuy);

        //then
        Assert.assertEquals("Conservative predictor] Buy debenturesnof xxxx",stevenShouldBuy);
        Assert.assertEquals("[Aggresive predictor] Buy stock XYX",johnShouldBuy);
        Assert.assertEquals("[Balanced Predictor ] Buy shared units of XYX",kodillaShouldBuy);
    }

    @Test
    public void testIndividualInvestingStrategy(){
        //given
        Customer steven = new IndividualCustomer("Steven");

        //when
        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should buy: "+stevenShouldBuy);
        steven.setBuyingStartegy(new AggresivePredictor());
        stevenShouldBuy = steven.predict();
        System.out.println("Steven now should: "+stevenShouldBuy);

        //then
        Assert.assertEquals("[Aggresive predictor] Buy stock XYX",stevenShouldBuy);
    }
}
