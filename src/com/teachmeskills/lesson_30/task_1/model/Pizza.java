package com.teachmeskills.lesson_30.task_1.model;

public class Pizza {
    private String size;
    private boolean withChicken;
    private boolean withBeef;
    private boolean withMushrooms;
    private boolean withCheeseSauce;
    private boolean withKetchup;

    public Pizza() {
    }

    public static class PizzaBuilder {
        private Pizza pizza;

        public PizzaBuilder() {
            pizza = new Pizza();
        }

        public PizzaBuilder setSize(String size) {
            pizza.size = size;
            return this;
        }

        public PizzaBuilder setWithChicken(boolean withChicken) {
            pizza.withChicken = withChicken;
            return this;
        }


        public PizzaBuilder setWithBeef(boolean withBeef) {
            pizza.withBeef = withBeef;
            return this;
        }

        public PizzaBuilder setWithMushrooms(boolean withMushrooms) {
            pizza.withMushrooms = withMushrooms;
            return this;
        }

        public PizzaBuilder setWithCheeseSauce(boolean withCheeseSauce) {
            pizza.withCheeseSauce = withCheeseSauce;
            return this;
        }

        public PizzaBuilder setWithKetchup(boolean withKetchup) {
            pizza.withKetchup = withKetchup;
            return this;
        }

        public Pizza buildPizza() {
            return pizza;
        }
    }

    @Override
    public String toString() {
        return "Your pizza:" + "\n" +
                "size='" + size + '\'' +
                ", chicken=" + withChicken +
                ", beef=" + withBeef +
                ", mushrooms=" + withMushrooms +
                ", cheese sauce=" + withCheeseSauce +
                ", ketchup=" + withKetchup;
    }
}
