package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class WordUtils {

    public String getShortestWord(@NotNull List<String> words){
        String shortestWord = words.get(0);

        for (String word : words){
            if (word.length() < shortestWord.length()){
                shortestWord = word;
            }
        }
        return shortestWord;
    }

    public Map<String, Integer> wordsCounter(@NotNull List<String> wordsToCount){
        Map<String, Integer> countedWords = new HashMap<>();

        wordsToCount.forEach(word -> {
            countedWords.putIfAbsent(word, 0);
            countedWords.computeIfPresent(word, (w, prev) -> prev + 1);
        });
        return countedWords;
    }
}
