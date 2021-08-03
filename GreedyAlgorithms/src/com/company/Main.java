package com.company;

public class Main {

    public static void main(String[] args) {
        int[] digits = {1, 7, 5, 9, 0, 9};
        System.out.println(Numbers.getMaxNumberFromDigits(digits));
        System.out.println(Numbers.getMaxNumFromDigits(digits));
        System.out.println("***********");

        int[] stations = {0, 200, 375, 550, 950};
        System.out.println(Stops.minStops(stations, 400));
    }
}
