package com.learningsimplified;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommonAlgorithmsTest {

    CommonAlgorithms commonAlgorithms = new CommonAlgorithms();

    @Test
    void findFactorial() {
        assertEquals(24, commonAlgorithms.findFactorial(4));
    }


    @Test
    void getFibonacciSeriesTillaNumber() {
        List<Integer> expectedList = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21);
        assertEquals(expectedList, commonAlgorithms.getFibonacciSeriesTillaNumber(21));
    }

    @Test
    void getFibonacciSeriesOfDesiredLength() {
        List<Integer> expectedList = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21);
        assertEquals(expectedList, commonAlgorithms.getFibonacciSeriesOfDesiredLength(9));
    }
}