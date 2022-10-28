package Semana3;


import Semana3.atributos.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){

        Cliente cliente = new Cliente(1.75,60.0);


        Clinica clinica = new Clinica("joao");

        clinica.listaDeClientes.add(cliente);

        clinica.categorizarClientes();


        }

    }

