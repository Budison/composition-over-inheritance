package com.github.budison.composition_over_inheritance;

/**
 * @author Kevin Nowak
 */
class Programmer implements Employee {

    @Override
    public void work() {
        System.out.println("Programmer is coding...");
    }
}
