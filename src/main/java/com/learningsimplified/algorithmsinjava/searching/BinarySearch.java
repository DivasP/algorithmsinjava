package com.learningsimplified.algorithmsinjava.searching;

/**
 * Given a sorted array of size N and an integer K,
 * find the position at which K is present in the array using binary search.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {4, 5, 8, 9, 11};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearchIterative(arr, 9, 0,arr.length-1));
    }

    int binarySearchIterative(int array[], int x, int low, int high) {

        // Repeat until the pointers low and high meet each other
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == x)
                return mid;

            if (array[mid] < x)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return -1;
    }

    int binarySearch(int array[], int x, int low, int high) {

        if (high >= low) {
            int mid = low + (high - low) / 2;

            // If found at mid, then return it
            if (array[mid] == x)
                return mid;

            // Search the left half
            if (array[mid] > x)
                return binarySearch(array, x, low, mid - 1);

            // Search the right half
            return binarySearch(array, x, mid + 1, high);
        }

        return -1;
    }
}