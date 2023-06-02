package hierarquiaExcecoes.exceptions;

// Exceção mais genérica
public class ContaCorrenteException extends Exception {
    public ContaCorrenteException(String message) {
        super(message);
    }
}