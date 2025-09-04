package com.tp2.stringcalculator;

public class StringCalculator {

    public int add(String numbers) {
        int suma=0;
        // string vacio
        if (numbers.isEmpty()) {
            return 0;
        }

        for (char c : numbers.toCharArray()) {
            String numero = String.valueOf(c); // paso el caracter a string para pasarlo dsps a int

            if (!numero.equals(",") && !numero.equals("\n")){
                int n = Integer.parseInt(numero); //lo convierto en int
                if (n<0){
                    throw new IllegalArgumentException("El numero es negativo");
                }
                else {
                    suma += n;
                }
            }
        }
        return suma;
    }
}
//"1,2" es 3