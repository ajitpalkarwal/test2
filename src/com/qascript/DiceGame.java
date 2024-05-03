package com.qascript;

import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you Number");
         int num = sc.nextInt();

         if(num > 6){
             System.out.println("You Won !!!");
         }else {
             System.out.println(" Oh! You Lost.");
         }

    }
}
