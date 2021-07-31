package com.company;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 7;
        long[] memoization = new long[n + 1];
        Arrays.fill(memoization, -1);

        System.out.println(getFibNumFast2(n, memoization));
        System.out.println(getFibNumFast(7));

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

    // рекурсией, но исключая повторные вычисления
    private static long getFibNumFast2(int n, long[] memoization){
        if(n <= 1)
            return n;

        if(memoization[n] != -1)
            return memoization[n];
        
        long result = getFibNumFast2(n-1, memoization) + getFibNumFast2(n-2, memoization);
        memoization[n] = result;

        return memoization[n];
    }

    // медленный способ из-за лишних вычислений в рекурсии
    private static long getFibNum(int n){
        if(n <= 1){
            return n;
        }

        return getFibNum(n-1) + getFibNum(n-2);
    }
}
