package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class NumberUtils {

    public int getSum(@NotNull List<Integer> numbers){
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public @NotNull List<Integer> multiplyOddNumber(@NotNull List<Integer> numbers) {
        List<Integer> oddNumbersMultipliedBy2 = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                oddNumbersMultipliedBy2.add(number * 2);
            }
        }
        return oddNumbersMultipliedBy2;
    }
}
