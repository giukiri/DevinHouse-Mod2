package Semana3.metodos;

import Semana3.atributos.Cliente;

import java.util.List;

public class CalculadoraImc {
    List<Double> historicoResultado;



    public Double IMC (Double num1, Double num2){
      Double resultado =  (num1 / (num2*num2));
      System.out.println(resultado);
      historicoResultado.add(resultado);
      return resultado;
    }

}
