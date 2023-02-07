package org.example;

import java.util.*;

public class BalancedWordsCounter {
    public int count(String input) throws IllegalArgumentException {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        if (!input.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Input should contain letters only");
        }

        int length = input.length();
        int result = 0;
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                String subword = input.substring(i, j + 1);
                if (!isBalanced(subword)) {
                    continue;
                }
                frequencyMap.put(subword, frequencyMap.getOrDefault(subword, 0) + 1);
            }
        }

        for (int count : frequencyMap.values()) {
            if (count == 1) {
                continue;
            }
            result += count * (count - 1) / 2;
        }
        return result;
    }

    private boolean isBalanced(String word) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : word.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        Set<Integer> frequencySet = new HashSet<>(frequencyMap.values());
        return frequencySet.size() == 1;
    }
}