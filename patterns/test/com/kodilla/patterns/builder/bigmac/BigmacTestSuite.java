package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuild(){
        //given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Buns.BUN_WITHOUT_SESAME)
                .burgers(2.0)
                .sauce(Sauces.STANDARD)
                .ingredients(Addition.CHEESE)
                .ingredients(Addition.BECKON)
                .ingredients(Addition.PICKLES)
                .build();
        System.out.println(bigmac);

        //when
        int howManyIngredients = bigmac.getIngredients().size();

        //then
        Assert.assertEquals(3,howManyIngredients);

    }
}
