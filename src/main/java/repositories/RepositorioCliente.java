package repositories;

import domain.Cliente;

public interface RepositorioCliente {
    Cliente buscarCliente(int dni);
}
