package com.java.PrevInterviewQstns;

import java.util.HashMap;
import java.util.Map;

public class FreqEachChar {
    public static void main(String[] args) {
        String str = "Software Developer";
        frequencyOfEachCharacter(str);
    }

    public static void frequencyOfEachCharacter(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            else {
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        for(char c: str.toCharArray()) {
        	if(map.get(c)==1) {
        		System.out.println(c +1);
        	}
        }
    }
}
