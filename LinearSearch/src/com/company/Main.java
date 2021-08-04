package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {1, 6, 8, 4, 9};
        System.out.println(getIndexOfElement(arr, 6));
    }

    // O(n)
    public static int getIndexOfElement(int[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }

        return -1;
    }
}
