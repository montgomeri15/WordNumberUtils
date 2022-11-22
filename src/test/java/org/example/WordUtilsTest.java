package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;
import static org.assertj.core.api.Assertions.assertThat;

public class WordUtilsTest {

    @DisplayName("Should return the shortest word")
    @ParameterizedTest
    @ValueSource(strings = {"he", "hello", "hel"})
    void testShortestWord(String incorrectWord) {
        WordUtils wordUtils = new WordUtils();
        List<String> testWordsList = Arrays.asList("he", "hello", "h", "hel", "hel");

        String testShortestWord = wordUtils.getShortestWord(testWordsList);

        assertThat(testShortestWord).isNotNull()
                .hasSize(1)
                .isEqualTo("h")
                .isNotEqualTo(incorrectWord);
    }

    @Test
    @DisplayName("Should return the correct words count")
    void testWordsCounter() {
        WordUtils wordUtils = new WordUtils();
        List<String> testWordsList = Arrays.asList("he", "hello", "h", "hel", "hel");

        Map<String, Integer> testWordsConterMap = wordUtils.wordsCounter(testWordsList);

        assertThat(testWordsConterMap).isNotNull()
                .hasSize(4)
                .contains(entry("he",1), entry("hello", 1), entry("h", 1), entry("hel", 2));
    }
}
