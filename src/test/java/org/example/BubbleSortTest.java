package org.example;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BubbleSortTest extends BubbleSort {
    private BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void testFirstInput() {
        assertEquals(Arrays.asList(1,3,4,5,6,8,8), bubbleSort.sort(Arrays.asList(1, 4, 5, 6, 8, 3, 8)));
    }

    @Test
    public void testSecondInput() {
        assertEquals(Arrays.asList(-9.3,0.1,0.2,4.0,5.0,9.0), bubbleSort.sort(Arrays.asList(-9.3, 0.2, 4.0, 0.1, 5.0, 9.0)));
    }

    @Test(expected = RuntimeException.class)
    public void testThirdInput() {
        bubbleSort.sort(Arrays.asList(""));
    }

    @Test()
    public void testFourthInput() {
        bubbleSort.sort(Arrays.asList(null,5.0001));
    }
    @Test(expected = RuntimeException.class)
    public void testFifthInput() {
        bubbleSort.sort(null);
    }


}