package com.foxminded.vdmpskn.collectionframework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CharCounterTest {

    CharCounter charCounter = new CharCounter();

    @Test
    void testCountUniqueValues() {
        LinkedHashMap<Character, Integer> expected = new LinkedHashMap<>();
        expected.put('h', 1);
        expected.put('e', 1);
        expected.put('l', 3);
        expected.put('o', 2);
        expected.put(' ', 1);
        expected.put('w', 1);
        expected.put('r', 1);
        expected.put('d', 1);
        expected.put('!', 1);

        String input = "hello world!";
        assertEquals(expected, charCounter.countUniqueCharacters(input));
    }

    @Test
    void testCountUniqueCharactersWithCache() {
        String input = "hello world!";
        Map<Character, Integer> testCache1 = charCounter.countUniqueCharacters(input);
        Map<Character, Integer> testCache2 = charCounter.countUniqueCharacters(input);
        assertSame(testCache1, testCache2);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void nullOrEmptyInputShouldThrowException(String input) {
        assertThrows(NullPointerException.class, () -> charCounter.countUniqueCharacters(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {" ", "             "})
    void stringOfSpacesShouldThrowNullPointerException(String input) {
        assertThrows(NullPointerException.class, () -> {
            charCounter.countUniqueCharacters(input);
        });
    }


}