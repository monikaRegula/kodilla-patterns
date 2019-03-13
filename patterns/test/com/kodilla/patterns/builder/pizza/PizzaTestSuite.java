package com.kodilla.patterns.builder.pizza;

import org.junit.Assert;
import org.junit.Test;

public class PizzaTestSuite {
    @Test
    public void testPizzaNew(){
        //given
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredient("Mozarella")
                .ingredient("Rucola")
                .ingredient("Basilium")
                .bottom("thin")
                .sauce("garlic")
                .build();
        System.out.println(pizza);

        //when
        int howManyIngredeints = pizza.getIngredients().size();

        //then
        Assert.assertEquals(3,howManyIngredeints);

    }


}
