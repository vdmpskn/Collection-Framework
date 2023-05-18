package com.foxminded.vdmpskn.collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharCounter {

    private Map<String, Map<Character, Integer>> cache;

    public CharCounter() {
        cache = new HashMap<>();
    }

    public Map<Character, Integer> countUniqueCharacters(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new NullPointerException("Input string cannot be null or empty.");
        }
        if (cache.containsKey(input)) {
            return cache.get(input);
        } else {
            Map<Character, Integer> charFrequency = new LinkedHashMap<>();
            for (char c : input.toCharArray()) {
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }
            cache.put(input, charFrequency);
            return charFrequency;
        }
    }
}

