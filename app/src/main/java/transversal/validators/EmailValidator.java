package transversal.validators;

public class EmailValidator {
    public boolean esEmailValido(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    public boolean esNumero(String texto) {
        if (texto == null) return false;
        return texto.matches("\\d+");
    }

    public boolean tieneLongitudMinima(String texto, int min) {
        return texto != null && texto.length() >= min;
    }
}
