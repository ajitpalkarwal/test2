package com.qascript;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(3);
        arrayList.add(1);
        System.out.println("Size = "+arrayList.size());
        System.out.println("Index of "+arrayList.indexOf(5));
        System.out.println("Element at index :" + arrayList.get(4));

        List<Integer> arrList =Arrays.asList(1,2,3,4,5,6,7,8);

    }
}
