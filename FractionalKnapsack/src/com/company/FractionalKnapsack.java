package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

    public static void main(String[] args) {
        Item[] items = {new Item(4, 20),
                        new Item(3, 18),
                        new Item(2, 14)};
        final double MAX_WEIGHT = 7;

        System.out.println(getMaxValue(items, MAX_WEIGHT));
    }

    public static double getMaxValue(Item[] items, double MAX_WEIGHT){
        double currentWeight = 0;
        double currentValue = 0;
        Arrays.sort(items, Comparator.comparingDouble(Item::getValuePerUnitOfWeight).reversed()); // O(n * log(n))

        for (int i = 0; i < items.length; i++) { // O(n)
            if(currentWeight < MAX_WEIGHT){
                if(items[i].getWeight() + currentWeight <= MAX_WEIGHT){
                    currentWeight += items[i].getWeight();
                    currentValue += items[i].getValue();
                }else{
                    currentValue += (MAX_WEIGHT - currentWeight) * items[i].getValuePerUnitOfWeight();
                    break;
                }
            }
        }

        return currentValue;
    }

}

class Item{
    private final double weight;
    private final double value;

    public Item(double weight, double value) {
        this.weight = weight;
        this.value = value;
    }

    public double getValuePerUnitOfWeight(){
        return value / weight;
    }

    public double getWeight() {
        return weight;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Item{" +
                "weight=" + weight +
                ", value=" + value +
                '}';
    }
}
