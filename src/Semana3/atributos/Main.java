package Semana3.atributos;

import Semana3.atributos.Cliente;
import Semana3.metodos.CalculadoraImc;

public class Main {
    public static void main(String [] args ){
        Cliente cliente = new Cliente();
        cliente.peso = 70;
        cliente.altura = 1.75;
        cliente.idade = "25" ;

        System.out.println(cliente.IMC(cliente.peso, cliente.altura));
    }



}

