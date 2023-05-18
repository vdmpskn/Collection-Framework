package com.foxminded.vdmpskn.collectionframework;

import java.util.Map;
import java.util.Scanner;

public class CharCountApplication {

    public static void main(String[] args) {
        CharCounter charCounter = new CharCounter();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your string of characters: ");
        String input = scanner.nextLine();
        System.out.println("Count unique symbols in your string: ");
        Map<Character, Integer> charFrequency = charCounter.countUniqueCharacters(input);

        System.out.println(input);
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            System.out.println("\"" + entry.getKey() + "\" - " + entry.getValue());
        }
    }

}
