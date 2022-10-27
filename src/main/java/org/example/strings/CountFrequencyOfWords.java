package org.example.strings;

import java.util.Arrays;
import java.util.HashMap;

public class CountFrequencyOfWords {
    public static void main(String[] args) {

        String str = "I am learning Java and DSA with Java";
//        String str = "java-coding-practice-basics";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                Integer value = map.get(arr[i]);
                map.put(arr[i], value + 1);
            }
        }
        System.out.println(map);
    }
}

/*
https://stackoverflow.com/questions/8923251/what-is-the-time-complexity-of-hashmap-containskey-in-java
 */