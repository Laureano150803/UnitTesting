package transversal.validators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TransversalTest {
    @Test void validationNullEsEmailValido(){
        EmailValidator validator = new EmailValidator(){};
        boolean nullValidation = validator.esEmailValido(null);
        Assertions.assertFalse(nullValidation);
    }
    @Test void trueEmailValidation(){
        EmailValidator validator = new EmailValidator(){};
        String email = "holamundo@yopmailcom";
        boolean correctEmail = validator.esEmailValido(email);
        Assertions.assertTrue(correctEmail);
    }
        @Test void validationOnlyNumbersEsNumero(){
        EmailValidator validator = new EmailValidator(){};
        String email = "1234567890";
        boolean result = validator.esNumero(email);
        Assertions.assertTrue(result);
    }
    @Test void validationNumberWithLettersEsNumero(){
        EmailValidator validator = new EmailValidator(){};
        String email = "100a200b300c900@gmai1.c0m";
        boolean result = validator.esNumero(email);
        Assertions.assertFalse(result);
    }
    @Test void validationNumberWithSymbolsEsNumero(){
        EmailValidator validator = new EmailValidator(){};
        String email = "300_11@#%&.com";
        boolean result = validator.esNumero(email);
        Assertions.assertFalse(result);
    }
}
