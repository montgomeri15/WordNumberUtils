package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberUtilsTest {

    @Test
    @DisplayName("Should calculate the correct sum")
    void testSum() {
        NumberUtils numberUtils = new NumberUtils();
        List<Integer> testNumbersList = Arrays.asList(1, 2, 3, 0, 1);

        int listSum = numberUtils.getSum(testNumbersList);
        int result = numberUtils.getSum(testNumbersList);
        int manualResult = 1 + 2 + 3 + 0 + 1;

        assertThat(result).isNotNull()
                .isEqualTo(listSum)
                .isEqualTo(manualResult)
                .isNotEqualTo(listSum + 1);
    }

    @Test
    @DisplayName("Should calculate the correct odd numbers multiplied by 2")
    void testOddNumbersMultipliedBy2(){
        NumberUtils numberUtils = new NumberUtils();
        List<Integer> testNumbersList = Arrays.asList(1, 2, 3, 0, 1);

        List<Integer> listNumbersMultipliedBy2 = numberUtils.multiplyOddNumber(testNumbersList);
        List<Integer> listManualResult = Arrays.asList(2, 6, 2);

        assertThat(listNumbersMultipliedBy2).isNotEmpty()
                .hasSize(3)
                .isEqualTo(listManualResult)
                .doesNotContain(1, 3, 0);
    }
}
