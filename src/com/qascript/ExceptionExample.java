package com.qascript;

public class ExceptionExample {

    public static void main(String[] args) {
        handleArithmeticException(5);
    }
    public static void handleArithmeticException(int num){
        try{
            int a = num/0;
        }catch (ArithmeticException exception){
            exception.printStackTrace();
            System.out.println("Divided by Zero...");
        }

    }


}

