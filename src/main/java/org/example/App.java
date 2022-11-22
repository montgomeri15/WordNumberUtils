package org.example;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main( String[] args) {
        WordUtils wordUtils = new WordUtils();
        NumberUtils numberUtils = new NumberUtils();
        List<String> words;
        List<Integer> numbers;

        try {
            words = Arrays.asList("he", "hello", "h", "hel", "hel");
            numbers = Arrays.asList(1, 2, 3, 0, 1);
            System.out.println("The shortest word is:\t" + wordUtils.getShortestWord(words) +
                                    "\nCounted words:\t" + wordUtils.wordsCounter(words) +
                                "\nSum of numbers is:\t" + numberUtils.getSum(numbers) +
                      "\nOdd numbers multiplied by 2:\t" + numberUtils.multiplyOddNumber(numbers));
        //I'm throwing a NPE as early as possible, before the JVM does it for me
        } catch (NullPointerException npe){
            throw npe;
        }
    }
}
