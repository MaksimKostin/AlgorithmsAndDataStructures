package com.company;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3, 7, 0, 5, 9, 4, 1, 8, 9, -1, -1};
        sortedByBubbleSortV2(arr);
        System.out.println(Arrays.toString(arr));
    }

    // O(n^2)
    private static void sortedByBubbleSortV1(int[] arr){
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if(arr[i] > arr[i+1]){
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                    isSorted = false;
                }
            }
        }
    }

    // улучшенная версия тк нет лишних сравнений
    private static void sortedByBubbleSortV2(int[] arr){
        int count = arr.length - 1;
        while(count > 0){
            for (int i = 0; i < count; i++) {
                if(arr[i] > arr[i+1]){
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
            count--;
        }
    }
}
