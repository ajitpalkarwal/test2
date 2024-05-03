package com.qascript;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        HashMap<String,String> h2 = new HashMap<>();

        hashMap.put("India","Delhi");
        hashMap.put("USA", "Washington");
        hashMap.put("Pakistan", "Islamabad");
        hashMap.put("Sri Lanka", "Colombo");

        h2.put("India","Delhi");
        h2.put("USA", "Washington");
        h2.put("Pakistan", "Islamabad");
        h2.put("Sri Lanka", "Colombo");

        System.out.println(hashMap);
        System.out.println(hashMap.get("India"));
//        System.out.println(hashMap./isEmpty());
//        System.out.println(hashMap.containsKey("USA"));
//        System.out.println(hashMap.containsValue("Colombo"));
        System.out.println(hashMap.equals(h2));
        System.out.println(hashMap.entrySet());
        System.out.println(h2.keySet());
    }
}

