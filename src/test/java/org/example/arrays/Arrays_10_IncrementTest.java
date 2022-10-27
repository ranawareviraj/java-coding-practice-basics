package org.example.arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Arrays_10_IncrementTest {
    Arrays_10_Increment arrays10Increment = new Arrays_10_Increment();

    @Test
    public void testArrayToUppercase() {
        String[] input = new String[]{"cat", "dog", "fish"};
        arrays10Increment.arrayToUppercase(input);
        Assert.assertArrayEquals(new String[]{"CAT", "DOG", "FISH"}, input);
    }

    @Test
    public void testArrayIncrement() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        arrays10Increment.arrayToIncrement(input);
        Assert.assertArrayEquals(new int[]{2, 3, 4, 5, 6}, input);

    }

}
