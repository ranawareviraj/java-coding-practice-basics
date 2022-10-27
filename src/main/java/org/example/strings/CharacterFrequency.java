package org.example.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "Hello World 123";
        str = str.replace(" ", "");
        Map<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character character = str.charAt(i);
            frequency.putIfAbsent(character, 1);
            if (frequency.get(character) >= Integer.valueOf(1)) {
                Integer value = frequency.get(character);
                frequency.put(character, value + 1);
            }
        }

        Set<Character> set = frequency.keySet();
        for (Character ch : set) {
            System.out.println(ch + " : " + frequency.get(ch));
        }
    }
}

/*
Q: Find duplicate characters in a String
 */