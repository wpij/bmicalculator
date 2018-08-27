package com.example.bmicalculator;

public class BmiCalculator {

    private int high; //wzrost
    private  int weight;  //waga

    public BmiCalculator() {
    }


    public BmiCalculator(int high, int weight) {
        this.high = high;
        this.weight = weight;
    }

    public int getHigh() {
        return high;
    }

    public int getWeight() {
        return weight;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int woman(int high, int weight) {return  weight*weight; }

    public int man(int high, int weight) {return high*high;}

}
