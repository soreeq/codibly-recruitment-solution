package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedWordsCounterTest extends BalancedWordsCounter {
    private BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();

    @Test
    public void testCountWithValidInput() {
        assertEquals(28, balancedWordsCounter.count("aabbabcccba"));
    }

    @Test
    public void testCountWithEmptyInput() {
        assertEquals(0, balancedWordsCounter.count(""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCountWithInvalidInput() {
        balancedWordsCounter.count("abababa1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCountWithNullInput() {
        balancedWordsCounter.count(null);
    }

}