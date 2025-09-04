package com.tp2.stringcalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringCalculatorTest {

    StringCalculator sc = new StringCalculator();

    @Test
    public void un_numero(){
        assertEquals(1,sc.add("1"));
    }
    @Test
    public void dos_numeros(){
        assertEquals(3,sc.add("1,2"));
    }
    @Test
    public void multiples_numeros(){
        assertEquals(6,sc.add("1,2,3"));
    }

    @Test
    public void string_vacio(){
        assertEquals(0,sc.add(""));
    }

    @Test
    public void salto_lineas(){
        assertEquals(6,sc.add("1\n2,3"));
    }

    @Test
    public void negativos(){
        assertThrows(IllegalArgumentException.class, () -> sc.add("-1,2"));
    }


//    Missing tests:
//
//- Empty string should return 0
//- Single number should return that number
//- Two numbers separated by comma should return their sum
//- Multiple numbers separated by comma should return their sum
//- Numbers separated by newline should work as delimiter
//- Negative numbers should throw IllegalArgumentException
}
