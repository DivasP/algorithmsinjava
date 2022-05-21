package com.learningsimplified.algorithmsinjava.problems;

/**
 * Given a sorted array of size N and an integer K,
 * find the position at which K is present in the array using binary search.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearchGeekForGeekSolution(arr, arr.length,6));
    }

    public int binarySearchGeekForGeekSolution(int arr[], int n, int k) {
        int high = n-1;
        int low = 0;
        int midIndex;
        while (low<=high){
             midIndex = low + (high-low)/2;
            if(arr[midIndex]==k){
                return midIndex;
            } else if (arr[midIndex]>k) {
                high = midIndex-1;
            } else if (arr[midIndex]<k) {
                low = midIndex+1;
            }
        }
        return -1;
    }
}
