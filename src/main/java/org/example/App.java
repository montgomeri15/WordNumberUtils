package org.example;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main( String[] args) {
        WordUtils wordUtils = new WordUtils();
        List<String> words;

        try {
            words = Arrays.asList("he", "hello", "h", "hel", "hel");
            System.out.println("The shortest word is:\t" + wordUtils.getShortestWord(words) +
                                                    "\n" + wordUtils.wordsCounter(words));
        //I'm throwing a NPE as early as possible, before the JVM does it for me
        } catch (NullPointerException npe){
            System.out.println("An array is null:\t" + npe.fillInStackTrace());
            throw npe;
        }
    }
}
