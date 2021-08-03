package com.company;

public class Stops {
    // {0, 200, 375, 550, 950}
    public static String minStops(int[] stations, int capacity){
        int result = 0;
        int currentStop = 0;

        while(currentStop < stations.length - 1){
            int nextStop = currentStop;

            while(nextStop < stations.length - 1 && stations[nextStop+1] - stations[currentStop] <= capacity){
                nextStop++;
            }

            if(currentStop == nextStop)
                return "невозможно";

            if(nextStop < stations.length - 1){
                System.out.println("Остановка на " + stations[nextStop] + " км");
                result++;
            }

            currentStop = nextStop;
        }
        return "Всего остановок: " + result;
    }
}
