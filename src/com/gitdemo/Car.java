package com.gitdemo;

public class Car {

    private String brand;
    private int cost;
    private int year;

    public Car(String brand, int cost, int year) {
        this.brand = brand;
        this.cost = cost;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return  "brand='" + brand + '\'' +
                ", cost=" + cost +
                ", year=" + year;
    }
}
