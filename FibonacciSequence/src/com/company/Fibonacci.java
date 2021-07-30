package com.company;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(getFibNumFast(100));
    }

    // быстрый способ
    private static long getFibNumFast(int n){
        if(n<=1){
            return n;
        }
        else{
            long[] arr = new long[n+1];
            arr[0] = 0;
            arr[1] = 1;

            for (int i = 2; i <= n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }

            return arr[n];
        }
    }

    // медленный способ из-за лишних вычислений
    private static long getFibNum(int n){
        if(n <= 1){
            return n;
        }
        
        return getFibNum(n-1) + getFibNum(n-2);
    }
}
