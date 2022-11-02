package Semana3;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String [] args) {
        System.out.println("Nome | IMC | Categoria");
        Clinica clinica = new Clinica("joao", "ooo");
        List<Cliente> listaClientes = new ArrayList<>();
        clinica.listarClientes(listaClientes);
        Map<String,List<Cliente>> mapaImc = clinica.categorizarClientesEmIMC(listaClientes);
        for(String categoria : mapaImc.keySet()){
            List<Cliente> lista = mapaImc.get(categoria);
            for( Cliente c: lista ){
                System.out.println(categoria + " " + c.getNome() + " " + c.getResultadoimc());
            }
        }

    }



}

