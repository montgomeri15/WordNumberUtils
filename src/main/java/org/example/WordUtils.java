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

        for (String word : wordsToCount) {
            Integer temp = countedWords.put(word, 1);
            if (temp != null) {
                countedWords.put(word, ++temp);
            }
        }
        return countedWords;
    }
}
