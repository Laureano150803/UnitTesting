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
        String email = "holamundo@yopmail.com";
        boolean correctEmail = validator.esEmailValido(email);
        Assertions.assertTrue(correctEmail);
    }
}
