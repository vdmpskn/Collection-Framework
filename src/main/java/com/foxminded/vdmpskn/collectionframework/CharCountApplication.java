package com.foxminded.vdmpskn.collectionframework;

import java.util.Scanner;

public class CharCountApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your string of characters: ");
        String input = scanner.nextLine();
        System.out.println("Count unique symbols in your string: ");

        CharCounter charCounter = new CharCounter();
        charCounter.charCounterOutput(input);
    }

}
