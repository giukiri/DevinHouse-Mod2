package Semana3;


import Semana3.atributos.Cliente;

public class Main {
    public static void main(String [] args){

            Cliente cliente = new Cliente();
            cliente.peso = 70;
            cliente.altura = 1.75;
            cliente.idade = "25" ;

        Clinica clinica = new Clinica();

        clinica.donoClinica = "joao";
        clinica.listaDeClientes.add(cliente);
        }

    }

