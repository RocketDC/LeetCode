package com.wissen.questions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsomorphicStringsTest {
    private final IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

    @Test
    public void testExample1() {
        String s = "egg";
        String t = "add";
        boolean expected = true;
        boolean result = isomorphicStrings.isIsomorphic(s, t);
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        String s = "foo";
        String t = "bar";
        boolean expected = false;
        boolean result = isomorphicStrings.isIsomorphic(s, t);
        assertEquals(expected, result);
    }

    @Test
    public void testExample3() {
        String s = "paper";
        String t = "title";
        boolean expected = true;
        boolean result = isomorphicStrings.isIsomorphic(s, t);
        assertEquals(expected, result);
    }

    @Test
    public void testSingleCharacter() {
        String s = "a";
        String t = "b";
        boolean expected = true;
        boolean result = isomorphicStrings.isIsomorphic(s, t);
        assertEquals(expected, result);
    }

    @Test
    public void testDifferentLength() {
        String s = "abc";
        String t = "abcd";
        boolean expected = false;
        boolean result = isomorphicStrings.isIsomorphic(s, t);
        assertEquals(expected, result);
    }

    @Test
    public void testSameString() {
        String s = "hello";
        String t = "hello";
        boolean expected = true;
        boolean result = isomorphicStrings.isIsomorphic(s, t);
        assertEquals(expected, result);
    }
}
