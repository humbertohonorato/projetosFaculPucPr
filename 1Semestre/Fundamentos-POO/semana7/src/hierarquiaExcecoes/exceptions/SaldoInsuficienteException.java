package hierarquiaExcecoes.exceptions;

// Exceção mais específica
public class SaldoInsuficienteException extends ContaCorrenteException {
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}