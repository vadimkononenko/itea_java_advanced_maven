package com.itea.homeworks;

import com.itea.homeworks.utils.calculation.Service;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculationServiceTest {
    private Service service;

    @Before
    public void setUp() throws Exception {
        service = new Service();
    }

    @Test
    public void add(){
        double expected = 10.0;
        double delta = 0;

        double actual = service.calculate(2,8,'+');

        assertEquals(expected,actual,delta);
    }

    @Test
    public void subtract(){
        double expected = 5;
        double delta = 0;

        double actual = service.calculate(10,5,'-');

        assertEquals(expected,actual,delta);
    }

    @Test
    public void multiply(){
        double expected = 25;
        double delta = 0;

        double actual = service.calculate(5,5,'*');

        assertEquals(expected,actual,delta);
    }

    @Test
    public void divide(){
        double expected = 5;
        double delta = 0;

        double actual = service.calculate(25,5,'/');

        assertEquals(expected,actual,delta);
    }

    @Test
    public void square(){
        double expected = 1.379729661461215;
        double delta = 0;

        double actual = service.calculate(5,5,'√');

        assertEquals(expected,actual,delta);
    }

    @Test
    public void pow(){
        double expected = 3125;
        double delta = 0;

        double actual = service.calculate(5,5,'^');

        assertEquals(expected,actual,delta);
    }

    @Test
    public void powAdvanced(){
        double expected = 14161;
        double delta = 0;

        double actual = service.calculate(5,5,'~');

        assertEquals(expected,actual,delta);
    }
}
