package Semana3;

import Semana3.atributos.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Clinica {

     private String donoClinica;
    List<Cliente> listaDeClientes = new ArrayList<>();

    public void categorizarClientes(){
        for(Cliente cliente: listaDeClientes){
            System.out.println(cliente.IMC(cliente.peso, cliente.altura));
        }
    }

    public void categorizarClientesEmIMC(){

        List<Cliente> listaClientesCategoria1 = new ArrayList<>();
        List<Cliente> listaClientesCategoria2 = new ArrayList<>();
        List<Cliente> listaClientesCategoria3 = new ArrayList<>();
        List<Cliente> listaClientesCategoria4 = new ArrayList<>();
        List<Cliente> listaClientesCategoria5 = new ArrayList<>();
        List<Cliente> listaClientesCategoria6 = new ArrayList<>();

        for (Cliente cliente: listaDeClientes){
            switch(cliente.IMC(cliente.peso, cliente.altura)) {
                case "Muito Magro":
                    listaClientesCategoria1.add(cliente);
                    break;
                case "Normal":
                    listaClientesCategoria2.add(cliente);
                    break;
                case "sobrepeso":
                    listaClientesCategoria3.add(cliente);
                    break;
                case "Obeso I":
                    listaClientesCategoria4.add(cliente);
                    break;
                case "Obeso II":
                    listaClientesCategoria5.add(cliente);
                case "obeso III";
                    listaClientesCategoria6.add(cliente)

            }
            }
        }


 private void addCliente(Cliente cliente){
        listaDeClientes.add(cliente);
    }

    public Clinica( String donoClinica){

        this.donoClinica = donoClinica;
    }
}
