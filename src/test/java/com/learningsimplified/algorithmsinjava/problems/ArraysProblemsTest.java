package com.learningsimplified.algorithmsinjava.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArraysProblemsTest {

    private ArraysProblems arraysProblems;
    @BeforeEach
    public void init(){
         arraysProblems = new ArraysProblems();
    }

    @Test
    void reverseInGroups() {

        List<Integer> input1 =new ArrayList<>();
        input1.add(1);
        input1.add(2);
        input1.add(3);
        input1.add(4);
        input1.add(5);

//        input2.add(5);
//        input2.add(6);
//        input2.add(8);
//        input2.add(9);
        arraysProblems.reverseInGroups((ArrayList<Integer>) input1,input1.size(),10);
    }

    @Test
    void check() {
//        long[]A={16,1,2,14,13,17,1}; //1,1,2,13,14,16,17
//        long[]B={14,1,16,2,13,2,17}; //1,2,2,13,14,16,17

        long[]A={2,2}; //1,1,2,13,14,16,17
        long[]B={3,3};


        System.out.println("the value is "+arraysProblems.check(A,B, 7));
    }

    @Test
    void sort012() {
        int[]a={0,0,2,1,0,2,1,0,2,1};
        arraysProblems.sort012(a,10);
    }
}