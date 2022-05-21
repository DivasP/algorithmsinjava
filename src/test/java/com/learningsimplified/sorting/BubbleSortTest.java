package com.learningsimplified.sorting;

import com.learningsimplified.algorithmsinjava.sorting.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class BubbleSortTest {


    @Test
    void bubbleSort() {
        int[] intArray= {2,5,1,4,0};
        BubbleSort bubbleSort = new BubbleSort();
        int[] sortedArray = bubbleSort.bubbleSort(intArray);
        Arrays.stream(sortedArray).forEach(i-> System.out.println(i));
    }
}