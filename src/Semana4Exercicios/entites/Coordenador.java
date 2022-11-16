package Semana4Exercicios.entites;

public class Coordenador extends Pessoa{

    private Integer quantidadeCursosCoord ;

    public Integer getQuantidadeCursosCoord() {
        return quantidadeCursosCoord;
    }

    public void setQuantidadeCursosCoord(Integer quantidadeCursosCoord) {
        this.quantidadeCursosCoord = quantidadeCursosCoord;
    }

    public Coordenador(String name, Integer idade, Integer  quantidadeCursosCoord){
        super(name,idade);
       this.quantidadeCursosCoord = quantidadeCursosCoord;

    }

    @Override
    public void obterInformacoes() {
        super.obterInformacoes();
    }
}
