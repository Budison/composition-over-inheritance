package com.github.budison.composition_over_inheritance.decorator;

/**
 * @author Kevin Nowak
 */
class Guacamole extends BurritoOptionalExtra {
    private final static double PRICE = 0.60;

    Guacamole(Burrito toDecorate) {
        super(toDecorate, PRICE);
    }
}
