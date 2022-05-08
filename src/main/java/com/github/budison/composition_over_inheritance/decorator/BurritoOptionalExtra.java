package com.github.budison.composition_over_inheritance.decorator;

/**
 * This class is the Decorator for Burrito. It represents optional extras that the burrito may or may not have.
 *
 * @author Kevin Nowak
 */
abstract class BurritoOptionalExtra implements Burrito {
   private final Burrito burrito;
   private final double price;

    protected BurritoOptionalExtra(Burrito toDecorate, double myPrice) {
        burrito = toDecorate;
        price = myPrice;
    }

    public final double getPrice() {
        return (burrito.getPrice() + price);
    }
}
