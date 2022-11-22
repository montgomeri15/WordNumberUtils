package org.example;

import java.util.*;

public class WordUtils {

    public String getShortestWord(List<String> words){
        Optional<String> shortestWord = Optional.ofNullable(words.get(0));

        for (int i = 0; i < words.size(); i++){
            if (words.get(i).length() < shortestWord.get().length()){
                shortestWord = Optional.ofNullable(words.get(i));
            }
        }
        return shortestWord.get();
    }

    public Map<String, Integer> wordsCounter(List<String> wordsToCount){
        Map<String, Integer> countedWords = new HashMap<>();

        wordsToCount.forEach(word -> {
            countedWords.putIfAbsent(word, 0);
            countedWords.computeIfPresent(word, (w, prev) -> prev + 1);
        });
        return countedWords;
    }
}
