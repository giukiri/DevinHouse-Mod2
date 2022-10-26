package Semana3;

import Semana3.atributos.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Clinica {

     String donoClinica;
    List<Cliente> listaDeClientes = new ArrayList<>();


    public void addCliente(Cliente cliente){
        listaDeClientes.add(cliente);
    }

    public Clinica(List<Cliente>listaDeClientes, String donoClinica){
        this.listaDeClientes=listaDeClientes;
        this.donoClinica = donoClinica;
    }
}
