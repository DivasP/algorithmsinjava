package com.learningsimplified.algorithmsinjava.common;

import java.util.ArrayList;
import java.util.List;

public class CommonAlgorithms {

    //factorial
    public long findFactorial(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * findFactorial(number - 1);
        }
    }

    //Get a list of fibonacci till a certain number is reached.
    public List<Integer> getFibonacciSeriesTillaNumber(int number) {
        Integer currentNumber = 0;
        List<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(0);
        fibonacciList.add(1);
        while (currentNumber < number) {
            int i = fibonacciList.size();
            currentNumber = fibonacciList.get(i - 1) + fibonacciList.get(i - 2);
            fibonacciList.add(currentNumber);
        }
        return fibonacciList;
    }

    // Get fibonacci series of a certain length. Which means giving the length of the series,and it will give us the
//required length fibonacci series.
    public List<Integer> getFibonacciSeriesOfDesiredLength(Integer length) {
        List<Integer> fibonacciList = new ArrayList<>();
        Integer currentNumber;
        fibonacciList.add(0);
        fibonacciList.add(1);
        while (fibonacciList.size() < length) {
            int i = fibonacciList.size();
            currentNumber = fibonacciList.get(i - 1) + fibonacciList.get(i - 2);
            fibonacciList.add(currentNumber);
        }
        return fibonacciList;
    }
}
