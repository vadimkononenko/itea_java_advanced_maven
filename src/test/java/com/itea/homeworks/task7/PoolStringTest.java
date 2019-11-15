package com.itea.homeworks.task7;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PoolStringTest {
    @Test
    public void StringsShouldBeEquals(){
        String s1 = "JAVA";
        String s2 = "JAVA";

        assertTrue(s1 == s2);
        assertTrue(s1.equals(s2));

        String s11 = new String("JAVA");
        String s22 = new String("JAVA");

        assertTrue(s11.equals(s22));
    }

    @Test
    public void StringsShouldBeDifferent(){
        String s1 = new String("JAVA");
        String s2 = new String("JAVA");

        assertFalse(s1 == s2);

        String s11 = "JAVA";
        String s22 = new String("JAVA");

        assertFalse(s11 == s22);
        assertTrue(s11.equals(s22));
    }
}
