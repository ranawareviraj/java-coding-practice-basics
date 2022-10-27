package org.example.sorting;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTest {

    SelectionSort selectionSort = new SelectionSort();

    @Test
    public void testSortArray() {
        int[] input = new int[]{23, 5, 4, 12, 11, 3};
        selectionSort.sortArray(input);
        Assert.assertArrayEquals(new int[]{3, 4, 5, 11, 12, 23}, input);
    }
}