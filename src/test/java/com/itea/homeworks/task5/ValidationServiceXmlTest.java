package com.itea.homeworks.task5;

import com.itea.homeworks.task5.utils.validation.ValidationUtils;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class ValidationServiceXmlTest {
    private ValidationUtils v1;

    @Before
    public void setUp() {
        v1 = new ValidationUtils();
    }

    @Test
    public void numberShouldBeInsertedCorrectly() {
        //PREDICATES
        String value1 = "+380981111111";
        String value2 = "0981234567";
        String value3 = "380980157075";
        String value4 = "38098015";

        //FUNCTIONALITY
        boolean result1 = v1.validatorPhoneNumber(value1);
        boolean result2 = v1.validatorPhoneNumber(value2);
        boolean result3 = v1.validatorPhoneNumber(value3);
        boolean result4 = v1.validatorPhoneNumber(value4);

        //TESTS
        assertFalse(result1);
        assertFalse(result2);
        assertTrue(result3);
        assertFalse(result4);
    }

    @Test
    public void emailShouldBeInsertedCorrectly() {
        //PREDICATES
        String value1 = "name1488@gmail.com";
        String value2 = "Petrovich_Official1927@gmail";
        String value3 = "wwergmail.com";
        String value4 = "wwer@gmailCom";

        //FUNCTIONALITY
        boolean result1 = v1.validatorEmail(value1);
        boolean result2 = v1.validatorEmail(value2);
        boolean result3 = v1.validatorEmail(value3);
        boolean result4 = v1.validatorEmail(value4);

        //TESTS
        assertTrue(result1);
        assertFalse(result2);
        assertFalse(result3);
        assertFalse(result4);
    }

    @Test
    public void IPShouldBeInsertedCorrectly() {
        //PREDICATES
        String value1 = "023.0.12.213";
        String value2 = "2344.4.322";
        String value3 = "4567.32.90-432";
        String value4 = "3456778990";

        //FUNCTIONALITY
        boolean result1 = v1.validatorIP(value1);
        boolean result2 = v1.validatorIP(value2);
        boolean result3 = v1.validatorIP(value3);
        boolean result4 = v1.validatorIP(value4);

        //TESTS
        assertFalse(result1);
        assertFalse(result2);
        assertFalse(result3);
        assertFalse(result4);
    }

}
