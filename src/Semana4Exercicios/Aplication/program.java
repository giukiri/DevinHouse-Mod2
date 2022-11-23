package Semana4Exercicios.Aplication;

import Semana4Exercicios.entites.Aluno;
import Semana4Exercicios.entites.Coordenador;
import Semana4Exercicios.entites.Mentor;
import Semana4Exercicios.entites.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class program {
    public static void main(String[] args ){

        Pessoa p1 = new Pessoa("Carla",-50);
        Pessoa p2 = new Aluno("Giulia",24,"Quimica",282785);
        Pessoa p3 = new Mentor("Fabricio", 50 , "JAVA");
        Pessoa p4 = new Coordenador("Murphy",6,3);

        List<Pessoa> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);

        for (Pessoa p : lista) {
        try{

                System.out.println(
                        p.obterInformacoes());


        } catch (Exception e){
            p.setIdade(Math.abs( p.getIdade()));
            try {
                System.out.println(
                        p.obterInformacoes());
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
        }





    }
}
