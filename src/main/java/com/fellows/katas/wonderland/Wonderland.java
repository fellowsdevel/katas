package com.fellows.katas.wonderland;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Wonderland {

    private Wonderland() {

    }

    public static boolean test(int number) {
        return isWonderlandNumber(number);
    }

    private static boolean isWonderlandNumber(int number) {
        return tamanho(number) &&
                multiplier(number)
                ;
    }

    private static boolean tamanho(int number) {
        return String.valueOf(number).length() == 6;
    }

    private static boolean multiplier(int number) {
        String sNum = String.valueOf(number);
        Set<String> originalSet = Arrays.stream(sNum.split("")).collect(Collectors.toSet());
        for (int x = 2; x <= 6; x++) {
            int mult = number * x;
            Set<String> xSet = Arrays.stream(String.valueOf(mult).split("")).collect(Collectors.toSet());
            if (!originalSet.containsAll(xSet)) {
                return false;
            }
        }
        System.out.printf("Number %d is a Wonderland number", number);
        return true;
    }
}
