package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        sortedBySelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // О(n^2)
    private static void sortedBySelectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i];
            int index = min(arr, i);
            if(i != index){
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
    }

    private static int min(int[] arr, int start){
        int minIndex = start;
        int minValue = arr[start];
        for (int i = start; i < arr.length; i++) {
            if(arr[i] < minValue){
                minIndex = i;
                minValue = arr[i];
            }
        }
        return minIndex;
    }

}
