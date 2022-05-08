package com.github.budison.composition_over_inheritance.decorator;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DecoratorTest {
    @Test
    public void testForCorrectPriceOfBurritosWithoutExtrasAndWithExtras() {
        // Given
        Burrito noExtra = new StandardBurrito();
        Burrito oneExtra = new Guacamole(new SuperBurrito());
        Burrito twoExtras = new Jalapeno(new Guacamole(new SuperBurrito()));
        // Then
        assertEquals(noExtra.getPrice(), 5.99);
        assertEquals(oneExtra.getPrice(), 7.59);
        assertEquals(twoExtras.getPrice(), 8.09);
    }
}
