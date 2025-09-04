package com.tp2.password;

public class PasswordValidator {

    public boolean isValid(String password) {
        // minimo longutid
        if (password.length() < 8) {
            return false;
        }
        // mayuscula y minuscula
        if (password.equals(password.toUpperCase()) || password.equals(password.toLowerCase())) {
            return false;
        }
        // al menos un numero
        boolean tiene_numero = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                tiene_numero = true;
                break;
            }
        }
        if  (tiene_numero == false) {
            return false;
        }
        // Caracteres especiales
        String especiales = "!@#$%^&*()_+-=[]{}|;:,.<>?";
        boolean especiales_valido = false;
        for (char c : password.toCharArray()) {
            if (especiales.indexOf(c) >= 0) {
                especiales_valido = true;
                break;
            }
        }
        if (especiales_valido == false) {
            return false;
        }


        // Consider these criteria:
        // - Minimum 8 characters
        // - At least 1 uppercase letter
        // - At least 1 lowercase letter  
        // - At least 1 number
        // - At least 1 special character (!@#$%^&*()_+-=[]{}|;:,.<>?)
        return true;
    }

}
