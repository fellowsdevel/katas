package com.fellows.katas.wonderland;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class WonderlandTest {


    @Test
    void findWondarlandNumber() {
        IntStream
                .rangeClosed(100000, 999999)
                .forEach(Wonderland::test);
    }

    @Test
    void unique_wonderland_number() {
        assertTrue(Wonderland.test(142857));
    }
}