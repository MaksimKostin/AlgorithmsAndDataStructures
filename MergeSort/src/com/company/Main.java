package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 5, 0, 45, 11};
        sortedByMergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortedByMergeSort(int[] arr, int low, int high){
        if(low < high){
            int mid = (low + high) / 2;
            sortedByMergeSort(arr, low, mid);
            sortedByMergeSort(arr, mid + 1, high);

            int[] buf = Arrays.copyOf(arr, arr.length);

            for (int k = low; k <= high ; k++) {
                buf[k] = arr[k];
            }

            int i = low;
            int j = mid + 1;

            for (int k = low; k <= high; k++) {

                if (i > mid) {
                    arr[k] = buf[j];
                    j++;
                } else if (j > high) {
                    arr[k] = buf[i];
                    i++;
                } else if (buf[j] < buf[i]) {
                    arr[k] = buf[j];
                    j++;
                } else {
                    arr[k] = buf[i];
                    i++;
                }
            }
        }
    }
}
