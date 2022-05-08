package com.github.budison.composition_over_inheritance.decorator;

/**
 * @author Kevin Nowak
 */
class Jalapeno extends BurritoOptionalExtra {
    private final static double PRICE = 0.50;

    Jalapeno(Burrito toDecorate) {
        super(toDecorate, PRICE);
    }
}
