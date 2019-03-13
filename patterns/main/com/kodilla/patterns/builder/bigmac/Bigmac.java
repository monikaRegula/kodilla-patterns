package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Bigmac {
    private final  String bun;
    private final double burgers;
    private final String sauce;
    private final List<String> ingredients ;


    public Bigmac build(){
        if (bun.length() == 0){
            throw new IllegalStateException("Bigmac must have bun or roll!");
        }
        if (sauce.length() == 0){
            throw new IllegalStateException("Bigmac must have sauce");
        }
        if (burgers <= 0 ){
            throw new IllegalStateException("Bigmac must have meet");
        }
        return new Bigmac(bun,burgers,sauce,ingredients);
    }

    public static class BigmacBuilder{
        private String bun;
        private double burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();
        private List<Addition> allAddition = Arrays.asList(Addition.values());
        private List<Sauces> allSauces = Arrays.asList(Sauces.values());
        private List<Buns> allBuns = Arrays.asList(Buns.values());

        public BigmacBuilder bun(Buns bun) {
            if (allBuns.contains(bun)){
                this.bun = String.valueOf(bun);
                return this;
            }
            else{
                throw new IllegalStateException("There is no such a bun for Bigmac! ");
            }

        }

        public BigmacBuilder burgers(double burgers){
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(Sauces sauce){
            if (allSauces.contains(sauce)){
                this.sauce = String.valueOf(sauce);
                return this;
            }else{
                throw new IllegalStateException("There is no such a sauce in BIGMAC");
            }

        }

        public BigmacBuilder ingredients(Addition ingredient){
            if (allAddition.contains(ingredient)){
                ingredients.add(String.valueOf(ingredient));
                return this;
            }else{
                throw new IllegalStateException("There is no such an addition for Bigmac");
            }

        }

        public Bigmac build(){
            return  new Bigmac(bun,burgers,sauce,ingredients);
        }
    }

    private Bigmac(final String bun ,final double burgers, final String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() { return bun; }

    public double getBurgers() { return burgers; }

    public String getSauce() { return sauce; }

    public List<String> getIngredients() { return ingredients; }

    @Override
    public String toString(){
        return "Bigmac{"
                +"burgers: "+burgers+'\''
                +", bun: "+bun + '\'' + ", sauce: "+sauce
                +'\'' + ", ingredients: "+ingredients + '}';
    }
}
