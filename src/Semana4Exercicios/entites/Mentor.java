package Semana4Exercicios.entites;

public class Mentor extends Pessoa{

    private String linguagem;

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public Mentor(String name, Integer idade, String linguagem){
        super(name,idade);
        this.linguagem = linguagem;


    }
}
