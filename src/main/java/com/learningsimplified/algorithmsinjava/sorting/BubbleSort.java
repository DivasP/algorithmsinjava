package com.learningsimplified.algorithmsinjava.sorting;

import java.util.List;

public class BubbleSort {

    public int[] bubbleSort(int [] unsortedNumber){
        for(int i=0;i<=unsortedNumber.length-1;i++){

            for (int j=0;j<=unsortedNumber.length-1;j++){
                if(unsortedNumber[j]>unsortedNumber[j+1]){
//                    swap(unsortedNumber[j],unsortedNumber[j+1],unsortedNumber);
                    int temp;
                    temp = unsortedNumber[j];
                    unsortedNumber[j]=unsortedNumber[j+1];
                    unsortedNumber[j+1]=temp;
                }
            }
        }
        return unsortedNumber;
    }

    private void swap(int i, int i1,int[] array) {
        int temp;
        temp = i;
        i=i1;
        i1=i;
    }
}
