package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {4, 7, 9, 4 , 6, 5, 4, 9, 0};
	    quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int from, int to){
        if(from < to){ // проверка на размерность массива(может состоять из 1 эл-та поэтому не нужно сортировать)
            int divideIndex = partition(arr, from, to);
            quickSort(arr, from, divideIndex - 1);
            quickSort(arr, divideIndex, to);
        }
    }

    private static int partition(int[] arr, int from, int to){
        int leftIndex= from;
        int rightIndex= to;
        int pivot = arr[(from+to)/2];
        while(leftIndex <= rightIndex){ // проверка на полное прохождение и сортировку подмассива
            while (arr[leftIndex] < pivot){
                leftIndex++;
            }
            while(arr[rightIndex] > pivot){
                rightIndex--;
            }
            if(leftIndex <= rightIndex){ // предотвращение swap для отсортированных пар
                swap(arr, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] arr, int firstIndex, int secondIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}