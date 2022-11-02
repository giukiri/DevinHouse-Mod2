package Semana3;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Clinica {

    private String donoClinica;
    private String nomeClinica;

    public Clinica (String donoClinica, String nomeClinica){
        this.nomeClinica=nomeClinica;
        this.donoClinica = donoClinica;
    }

    public  void listarClientes(List<Cliente> listaClientes ){


        listaClientes.add(new Cliente("Maria", 90.0, 1.75));
        listaClientes.add(new Cliente("joao", 40.0, 1.65));

    }

    public Map<String,List<Cliente>> categorizarClientesEmIMC(List<Cliente> listaClientes ) {

        List<Cliente> listaClientesCategoria1 = new ArrayList<>();
        List<Cliente> listaClientesCategoria2 = new ArrayList<>();
        List<Cliente> listaClientesCategoria3 = new ArrayList<>();
        List<Cliente> listaClientesCategoria4 = new ArrayList<>();
        List<Cliente> listaClientesCategoria5 = new ArrayList<>();
        List<Cliente> listaClientesCategoria6 = new ArrayList<>();
        Map<String, List<Cliente>> mapaImc = new HashMap<>();
        mapaImc.put("Muito Magro", listaClientesCategoria1);
        mapaImc.put("Normal", listaClientesCategoria2);
        mapaImc.put("sobrepeso", listaClientesCategoria3);
        mapaImc.put("Obeso I", listaClientesCategoria4);
        mapaImc.put("Obeso II", listaClientesCategoria5);
        mapaImc.put("Obeso III", listaClientesCategoria6);


        for (Cliente cliente : listaClientes) {

            if (cliente.getResultadoimc() < 18.5) {
                listaClientesCategoria1.add(cliente);
            } else if (cliente.getResultadoimc() > 18.5 && cliente.getResultadoimc() < 24.9) {
                listaClientesCategoria2.add(cliente);
            } else if (cliente.getResultadoimc() > 25 && cliente.getResultadoimc() < 29.9) {
                listaClientesCategoria3.add(cliente);
            } else if (30 < cliente.getResultadoimc() && cliente.getResultadoimc() < 34.9) {
                listaClientesCategoria4.add(cliente);
            } else if (35 < cliente.getResultadoimc() && cliente.getResultadoimc() < 39.9) {
                listaClientesCategoria5.add(cliente);
            } else if (cliente.getResultadoimc() > 40) {
                listaClientesCategoria6.add(cliente);
            }

        }

        return mapaImc;
    }


}










