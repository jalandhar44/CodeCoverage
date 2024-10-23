package com.training.example.JacocoExample;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
    public void testEmptyString() {
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.isPalindrome(""));
    }

    @Test
    public void testSingleCharacter() {
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.isPalindrome("a"));
    }

    @Test
    public void testPalindromeString() {
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.isPalindrome("madam"));
    }

    @Test
    public void testNonPalindromeString() {
        Palindrome palindrome = new Palindrome();
        assertFalse(palindrome.isPalindrome("hello"));
    }
}
