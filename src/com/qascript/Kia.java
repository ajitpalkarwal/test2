package com.qascript;

public class Kia {

    public static void main(String[] args) {
        Car audi = new Car();
        Car.accelerate();
        Car.start();
        audi.setName("Audi");
        audi.printName();
        Car.start();
        displayLogo("Kia");
        displayLogo("Logo","Name");
    }
    public static void displayLogo(String s1, String s2){

        System.out.println("PRinting s1 :"+ s1 + " Printiong s2"+s2);
    }

    public static void displayLogo(String logoName){
        System.out.println(logoName);

    }
}
