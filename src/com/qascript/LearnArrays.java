package com.qascript;

import java.util.Arrays;

public class LearnArrays {
    public static void main(String[] args) {

        int[] arr ={2,3,4,5,6,7};
        int[] arr2 = {1,2,3,4,5};
        System.out.println(arr[3]);
        for (int j : arr) {
            System.out.println(j);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        if(Arrays.equals(arr,arr2)){
            System.out.println("arrays are equal");
        }else{
            System.out.println("not equal");
        }
    }
}
