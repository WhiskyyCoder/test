package com.domanski;

public class WordUtils {

    private final static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    private static int positionAlphabet(char x) {
        int i = 1;
        for (char current : alphabet) {
            if (current == x)
                return i;
            i++;
        }

        return 0;
    }
    
    public static int stringPower(String testString) {

        int result = 0;

        if (testString == null)
            return result;

        if (testString.isEmpty())
            return result;

        for (char letter : testString.toLowerCase().toCharArray())
            result += positionAlphabet(letter);



        return result;
    }
}
