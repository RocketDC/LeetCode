package com.wissen.questions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OneBlockTest {
    private final OneBlock oneBlock = new OneBlock();

    @Test
    public void testExample1() {
        int[] arr = {1, 0, 1, 0, 1};
        int expected = 4;
        int result = oneBlock.countOneBlocks(arr);
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        int[] arr = {1, 1, 1};
        int expected = 0;
        int result = oneBlock.countOneBlocks(arr);
        assertEquals(expected, result);
    }

    @Test
    public void testSingleOne() {
        int[] arr = {1};
        int expected = 1;
        int result = oneBlock.countOneBlocks(arr);
        assertEquals(expected, result);
    }

    @Test
    public void testAllZeros() {
        int[] arr = {0, 0, 0, 0};
        int expected = 0;
        int result = oneBlock.countOneBlocks(arr);
        assertEquals(expected, result);
    }

    @Test
    public void testMultipleOnes() {
        int[] arr = {1, 0, 1, 0, 1, 0, 1};
        int expected = 16;
        int result = oneBlock.countOneBlocks(arr);
        assertEquals(expected, result);
    }

    @Test
    public void testAdjacentOnes() {
        int[] arr = {1, 1, 0, 1, 1};
        int expected = 0;
        int result = oneBlock.countOneBlocks(arr);
        assertEquals(expected, result);
    }
}
