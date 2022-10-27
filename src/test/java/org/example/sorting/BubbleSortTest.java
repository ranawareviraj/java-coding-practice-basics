package org.example.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BubbleSortTest {

    BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void testSortArray() {
        int[] input = new int[]{23, 5, 4, 12, 11, 3};
        bubbleSort.sortArray(input);
        Assert.assertArrayEquals(new int[]{3, 4, 5, 11, 12, 23}, input);
    }
}