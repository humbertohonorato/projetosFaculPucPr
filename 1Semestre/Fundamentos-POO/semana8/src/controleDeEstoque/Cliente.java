package controleDeEstoque;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cliente extends Pessoa {
    private static List<Cliente> listaClientes = new ArrayList<>();

    public Cliente(UUID codigo, String nome, String documento, String telefone) {
        super(codigo, nome, documento, telefone);
    }

    @Override
    public void adicionar() {
        listaClientes.add(this);
        System.out.println("Cliente adicionado: ");
    }

    // Método estático para obter a lista de clientes
    public static List<Cliente> getListaClientes() {
        return listaClientes;
    }

}
