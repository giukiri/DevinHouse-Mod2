package Semana4Exercicios.entites;

public class Pessoa {
    private String name;
    private Integer idade;

    public Pessoa(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Pessoa(String name, Integer idade){
        this.idade=idade;
        this.name=name;
    }

    public void obterInformacoes(){
        getIdade();
        getName();
    }
}
