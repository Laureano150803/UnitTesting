package transversal.validators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TransversalTest {
    @Test void validationNullEsEmailValido(){
        EmailValidator validator = new EmailValidator(); // CORREGIDO
        boolean nullValidation = validator.esEmailValido(null);
        Assertions.assertFalse(nullValidation);
    }
    @Test void trueEmailValidation(){
        EmailValidator validator = new EmailValidator(); // CORREGIDO
        String email = "holamundo@yopimail.com";
        boolean correctEmail = validator.esEmailValido(email);
        Assertions.assertTrue(correctEmail);
    }
    @Test void validationOnlyNumbersEsNumero(){
        EmailValidator validator = new EmailValidator(); // CORREGIDO
        String email = "1234567890";
        boolean result = validator.esNumero(email);
        Assertions.assertTrue(result);
    }
    @Test void validationNumberWithLettersEsNumero(){
        EmailValidator validator = new EmailValidator(); // CORREGIDO
        String email = "100a200b300c900@gmai1.c0m";
        boolean result = validator.esNumero(email);
        Assertions.assertFalse(result);
    }
    @Test void validationNumberWithSymbolsEsNumero(){
        EmailValidator validator = new EmailValidator(); // CORREGIDO
        String email = "300_11@#%&.com";
        boolean result = validator.esNumero(email);
        Assertions.assertFalse(result);
    }
    @Test
    void validationEmptyStringEsEmailValido() {
        EmailValidator validator = new EmailValidator(); // CORREGIDO
        boolean result = validator.esEmailValido("");
        Assertions.assertFalse(result); // cadena vacía no es válida
    }

    @Test
    void validationMissingAtSymbolEsEmailValido() {
        EmailValidator validator = new EmailValidator(); // CORREGIDO
        boolean result = validator.esEmailValido("usuario.dominio.com");
        Assertions.assertFalse(result); // falta @
    }

    @Test
    void validationMissingDomainEsEmailValido() {
        EmailValidator validator = new EmailValidator(); // CORREGIDO
        boolean result = validator.esEmailValido("usuario@");
        Assertions.assertFalse(result); // falta dominio
    }

    @Test
    void validationUpperCaseEmailEsEmailValido() {
        EmailValidator validator = new EmailValidator(); // CORREGIDO
        boolean result = validator.esEmailValido("HOLA@MAIL.COM");
        Assertions.assertTrue(result); // debería ser válido si solo verifica formato
    }

    @Test
    void validationSpecialCharactersEsEmailValido() {
        EmailValidator validator = new EmailValidator(); // CORREGIDO
        boolean result = validator.esEmailValido("user.name+tag@mail.com");
        Assertions.assertTrue(result); // emails con + o . suelen ser válidos
    }
    @Test
    void validationNullEsNumero() {
        EmailValidator validator = new EmailValidator(); // CORREGIDO
        boolean result = validator.esNumero(null);
        Assertions.assertFalse(result); // null no debe ser número
    }

    @Test
    void validationEmptyStringEsNumero() {
        EmailValidator validator = new EmailValidator(); // CORREGIDO
        boolean result = validator.esNumero("");
        Assertions.assertFalse(result); // vacío no es número
    }

    @Test
    void validationSpacesInStringEsNumero() {
        EmailValidator validator = new EmailValidator(); // CORREGIDO
        boolean result = validator.esNumero("123 456");
        Assertions.assertFalse(result); // contiene espacio
    }
}