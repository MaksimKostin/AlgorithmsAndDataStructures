package com.company;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 9, 10, 11}; // массив должен быть отсортированным
        System.out.println(binarySearch(arr, 10));

        System.out.println(binarySearchReс(arr, 10, 0, arr.length -1));
    }

    // O(log(n))
    // бинарный поиск с использованием циклов
    public static int binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int middle = low + (high - low) / 2;

            if(arr[middle] > key) {
                high = middle - 1;
            }else if(arr[middle] < key){
                low = middle + 1;
            }else{
                return middle;
            }
        }

        return -1;
    }

    // бинарный поиск с использованием рекурсии
    public static int binarySearchReс(int[] arr, int key, int low, int high){
        int middle = low + (high - low) / 2;

        if(low > high){
            return -1;
        }else if(arr[middle] == key){
            return middle;
        }else if(arr[middle] > key){
            return binarySearchReс(arr, key, low, middle - 1);
        }else
            return binarySearchReс(arr, key, middle + 1, high);
    }
}
