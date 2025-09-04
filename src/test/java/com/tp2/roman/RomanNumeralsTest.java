package com.tp2.roman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {

    @Test
    public void basic_numbersI(){
        RomanNumerals r = new RomanNumerals();
        assertEquals("I", r.convert(1));
    }
    @Test
    public void basic_numbersV(){
        RomanNumerals r = new RomanNumerals();
        assertEquals("V", r.convert(5));
    }
    @Test
    public void basic_numbersX(){
        RomanNumerals r = new RomanNumerals();
        assertEquals("X", r.convert(10));
    }
    @Test
    public void restas(){
        RomanNumerals r = new RomanNumerals();
        assertEquals("IX", r.convert(9));
    }
    @Test
    public void restasIV(){
        RomanNumerals r = new RomanNumerals();
        assertEquals("IV", r.convert(4));
    }
    @Test
    public void medianosXL(){
        RomanNumerals r = new RomanNumerals();
        assertEquals("XL", r.convert(40));
    }
    @Test
    public void medianosL(){
        RomanNumerals r = new RomanNumerals();
        assertEquals("L", r.convert(50));
    }
    @Test
    public void medianosXC(){
        RomanNumerals r = new RomanNumerals();
        assertEquals("XC", r.convert(90));
    }
    @Test
    public void medianosC(){
        RomanNumerals r = new RomanNumerals();
        assertEquals("C", r.convert(100));
    }
    @Test
    public void grandesCD(){
        RomanNumerals r = new RomanNumerals();
        assertEquals("CD", r.convert(400));
    }
    @Test
    public void grandesD(){
        RomanNumerals r = new RomanNumerals();
        assertEquals("D", r.convert(500));
    }
    @Test
    public void grandesCM(){
        RomanNumerals r = new RomanNumerals();
        assertEquals("CM", r.convert(900));
    }
    @Test
    public void grandesM(){
        RomanNumerals r = new RomanNumerals();
        assertEquals("M", r.convert(1000));
    }
    @Test
    public void complejos_1(){
        RomanNumerals r = new RomanNumerals();
        assertEquals("MCMXCIV", r.convert(1994));
    }
    @Test
    public void complejos_2(){
        RomanNumerals r = new RomanNumerals();
        assertEquals("MMXXIII", r.convert(2023));
    }


//    Missing tests:
//
//- Convert 1 to "I"
//- Convert 5 to "V"
//- Convert 10 to "X"
//- Convert 4 to "IV" (subtraction case)
//- Convert 9 to "IX" (subtraction case)
//- Convert 40 to "XL"
//- Convert 50 to "L"
//- Convert 90 to "XC"
//- Convert 100 to "C"
//- Convert 400 to "CD"
//- Convert 500 to "D"
//- Convert 900 to "CM"
//- Convert 1000 to "M"
//- Convert complex numbers like 1994 to "MCMXCIV"
}
