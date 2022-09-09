package com.gitdemo;


public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", 20000, 2010);
        Car car2 = new Car("Honda", 10000, 2005);
        Car car3 = new Car("Audi", 30000, 2020);


        int totalCost = car1.getCost() + car2.getCost() + car3.getCost();
        System.out.println(totalCost);
    }
}
