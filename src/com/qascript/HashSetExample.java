package com.qascript;

import java.util.*;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<String> h1 = new HashSet<>();

        h1.add("one");
        h1.add("two");
        h1.add("three");
        h1.add("four");
        h1.add("five");
        System.out.println(h1);
        System.out.println(h1.contains("three"));
        System.out.println(h1.size());
        System.out.println(h1);

        Set<Integer> hs1 = new HashSet<>(); //This is also correct



        for (String element : h1) {
            System.out.println("Element = " + element);
        }
        // iterator
        Iterator<String> iterator = h1.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println("Element = "+element);
        }

        List<String> newList = new ArrayList<>();
        newList.add("Java");
        newList.add("C");
        newList.add("C++");
        newList.add("Python");
        newList.add("HTML");
        newList.add("Ruby");

        h1.addAll(newList);
        for(String s : h1){
            System.out.println(s);
        }
   }
}
