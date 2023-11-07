package services;

import domain.Cliente;
import repositories.RepositorioCliente;

public class ServicioClientes {

    private RepositorioCliente repositorioCliente;

    public ServicioClientes(RepositorioCliente repositorio){
        this.repositorioCliente = repositorio;
    }

    public Cliente buscarCliente(int dni){
        return repositorioCliente.buscarCliente(dni);
    }
}
