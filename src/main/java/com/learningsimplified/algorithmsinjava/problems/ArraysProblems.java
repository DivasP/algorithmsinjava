package com.learningsimplified.algorithmsinjava.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArraysProblems {
    /**
     * Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.
     */
        void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
            // code here
                List<Integer> newList = new ArrayList<>();
                for (int i = 0; i < n; i = i + k) {
                    int p = i+k-1<n?i+k-1:n-1;
                    for(int j = p;j>=i;j--){
                        newList.add(arr.get(j));
                    }
            }
            arr.clear();
            arr.addAll(newList);
            System.out.println(arr);
            System.out.println(newList);
        }
    /**
     * Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.
     * Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.
     */
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {//Your code here
        boolean equal = false;
        if(A.length==B.length && A.length==N) {
            Map<Long, Long> map1 = new HashMap<>();
            Map<Long, Long> map2 = new HashMap<>();
            for (long element : A) {
                long i = 1;
                if (map1.containsKey(element)) {
                    map1.put(element, map1.get(element) + 1);
                } else {
                    map1.put(element, i);
                }
            }
            for (long element : B) {
                long i = 1;
                if (map2.containsKey(element)) {
                    map2.put(element, map2.get(element) + 1);
                } else {
                    map2.put(element, i);
                }
            }
            if(map1.keySet().containsAll(map2.keySet()) && map2.keySet().containsAll(map1.keySet())) {
                for (long elements : map1.keySet()) {
                    if (!(map2.containsKey(elements)) || !(map1.get(elements) == map2.get(elements))) {
                        equal = false;
                        break;
                    }else{
                        equal = true;
                    }
                }
            }
        }
        return equal;
    }

    /**
     * Problem statement: sort any array that contains only 0,1,2 element.
     * @param a
     * @param n
     */
    void sort012(int a[], int n)
    {
        int numberOf1=0;
        int numberOf2=0;

        for(int element:a){
            if(element==1){
                numberOf1++;
            } else if (element==2) {
                numberOf2++;
            }
        }
        for(int j=0;j<(n-(numberOf1+numberOf2));j++){
            a[j]=0;
        }
        for(int j=(n-(numberOf1+numberOf2));j<(n-numberOf2);j++){
            a[j]=1;
        }
        for(int j=(n-numberOf2);j<n;j++){
            a[j]=2;
        }
    }
}
