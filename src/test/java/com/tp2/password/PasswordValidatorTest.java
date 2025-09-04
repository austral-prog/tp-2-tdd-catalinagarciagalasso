package com.tp2.password;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PasswordValidatorTest {

    @Test
    public void longitud_minima(){
        PasswordValidator password = new PasswordValidator();
        assertFalse(password.isValid("hola"));
    }

    @Test
    public void upper_case(){
        PasswordValidator password = new PasswordValidator();
        assertFalse(password.isValid("sinmayuscula"));
    }

    @Test
    public void lower_case(){
        PasswordValidator password = new PasswordValidator();
        assertFalse(password.isValid("SINMINUSCULA"));
    }

    @Test
    public void number(){
        PasswordValidator password = new PasswordValidator();
        assertFalse(password.isValid("sinnumero"));
    }

    @Test
    public void special(){
        PasswordValidator password = new PasswordValidator();
        assertFalse(password.isValid("noespeciales"));
    }

    @Test
    public void todas_condiciones(){
        PasswordValidator password = new PasswordValidator();
        assertTrue(password.isValid("Genial1@"));
    }

//    Missing tests:
//
//- Password with less than 8 characters should be invalid
//- Password with 8 or more characters should pass length validation
//- Password without uppercase letter should be invalid
//- Password without lowercase letter should be invalid
//- Password without number should be invalid
//- Password without special character should be invalid
//- Password meeting all criteria should be valid
}
