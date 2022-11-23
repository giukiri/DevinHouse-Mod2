package Semana4Exercicios.entites;

public class Aluno extends Pessoa{
    private String curso;
    private Integer matricula;

    public Aluno(){
        super();
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Aluno(String name, Integer idade, String curso, Integer matricula){
        super(name,idade);
        this.curso=curso;
        this.matricula= matricula;
    }

    @Override
    public String  obterInformacoes() throws Exception {
        String info = super.obterInformacoes();
        return info + getCurso() + getMatricula();
    }
}
