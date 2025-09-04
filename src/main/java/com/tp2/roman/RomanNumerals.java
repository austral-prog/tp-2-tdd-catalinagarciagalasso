package com.tp2.roman;

import java.util.ArrayList;
import java.util.List;

public class RomanNumerals {
    
    public String convert(int number) {
        //genero listas de valores y su n romano
        List<Integer> valores = new ArrayList<>();
        valores.add(1000);
        valores.add(900);
        valores.add(500);
        valores.add(400);
        valores.add(100);
        valores.add(90);
        valores.add(50);
        valores.add(40);
        valores.add(10);
        valores.add(9);
        valores.add(5);
        valores.add(4);
        valores.add(1);

        List<String> romanos = new ArrayList<>();
        romanos.add("M");
        romanos.add("CM");
        romanos.add("D");
        romanos.add("CD");
        romanos.add("C");
        romanos.add("XC");
        romanos.add("L");
        romanos.add("XL");
        romanos.add("X");
        romanos.add("IX");
        romanos.add("V");
        romanos.add("IV");
        romanos.add("I");

        List<String> resultado = new ArrayList<>();

        for (int i = 0; i < valores.size(); i++){
            while(number >= valores.get(i)){
                number -= valores.get(i);
                resultado.add(romanos.get(i));
            }
        }
        String r = "";
        for (int i =0; i< resultado.size(); i++){
            r += resultado.get(i);
        }

        return r;
    }
}
