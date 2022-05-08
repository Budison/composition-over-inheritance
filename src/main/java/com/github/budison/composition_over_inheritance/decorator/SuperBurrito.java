package com.github.budison.composition_over_inheritance.decorator;

/**
 * @author Kevin Nowak
 */
class SuperBurrito implements Burrito {
    private static final double BASE_PRICE = 6.99;

    @Override
    public double getPrice() {
        return BASE_PRICE;
    }
}
