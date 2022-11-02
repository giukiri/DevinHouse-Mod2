package Semana3;

import java.util.ArrayList;
import java.util.List;


public class Cliente {


    private double peso;
    private double altura;
    private String nome;

    private double resultadoimc;


    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public String getNome() {
        return nome;
    }

    public Cliente(String nome, Double peso, Double altura) {
        this.peso = peso;
        this.altura = altura;
        this.nome = nome;
        resultadoimc = calcularImc();
    }

    public double getResultadoimc() {
        return resultadoimc;
    }



    public Double calcularImc() {
        List<Double> historicoResultado = new ArrayList<>();
        double resultadoimc = (peso / (altura * altura));
        historicoResultado.add(resultadoimc);
        return resultadoimc;
    }
}





















