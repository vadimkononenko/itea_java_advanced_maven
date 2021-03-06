package com.itea.homeworks.task5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringServiceXmlTest {
    @Test
    public void shouldReturnLengthCorrectly() {
        String s = "123456789";

        assertEquals(9, s.length());
    }

    @Test
    public void shouldConcatStringsCorrectly() {
        String s1 = "nagibator";
        String s2 = "     ";
        String s3 = "";

        assertEquals("nagibator228", s1.concat("2" + "2" + "8"));
        assertEquals("        ", s2.concat(" " + " " + " "));
        assertEquals("1 2 3", s3.concat("1" + " 2" + " 3"));
    }

    @Test
    public void shouldReturnLastIndexCorrectly() {
        String s = "JAVA in my heart";

        assertEquals(15, s.lastIndexOf('t'));
    }

    @Test
    public void shouldReplaceWordCorrectly() {
        String s = "JAVA in my heart";

        assertEquals("Apple in my heart", s.replaceAll("JAVA", "Apple"));
    }

    @Test
    public void shouldSubstringStringCorrectly() {
        String s = "Hello dear teacher, hello how are, we are very happy to say hello to you";

        assertEquals("Hello dear teacher", s.substring(0, 18));
    }

    @Test
    public void shouldTrimStringCorrectly() {
        String s = "       How are you?)            ";

        assertEquals("How are you?)", s.trim());
    }

    @Test
    public void shouldTrimStrindgCorrectly() {
        String s = "P r o g r a m m i n g";
        String[] expected = new String[]{"P","r","o","g","r","a","m","m","i","n","g"};

        assertEquals(expected, s.split(" "));
    }
}
