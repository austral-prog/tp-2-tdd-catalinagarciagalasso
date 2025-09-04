package com.tp2.leapyear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    public void testDivisibleBy4(){
        LeapYear año = new LeapYear();
        assertTrue(año.isLeapYear(2004));
    }

    @Test
    public void testDivisibleby100(){
        LeapYear año = new LeapYear();
        assertFalse(año.isLeapYear(1900));
    }

    @Test
    public void testDivisibleby400(){
        LeapYear año = new LeapYear();
        assertTrue(año.isLeapYear(2000));
    }

    @Test
    public void testNotDivisibleby4(){
        LeapYear año = new LeapYear();
        assertFalse(año.isLeapYear(2001));
    }

//    Missing tests:
//
//- A year is a leap year if it is divisible by 4
//- A year is not a leap year if it is divisible by 100
//- A year is a leap year if it is divisible by 400
}
