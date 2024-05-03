package com.qascript;

public class Car {

        private String name;
        private int price;
        private double wgh;



    public static void start(){

        System.out.println("Start Car....");
    }

    public static void accelerate(){
        System.out.println("Accelerate");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(this.name);
    }

    public void setPrice(int price) {
        this.price = price;
        System.out.println(this.price);
    }

    public void setWgh(double wgh) {
        this.wgh = wgh;
        System.out.println(this.wgh);
    }
    public void printName(){
        System.out.println(this.name);
    }
}
