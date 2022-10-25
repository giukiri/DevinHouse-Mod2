package Semana3.atributos;

public class Cliente {
   public double peso;
    public double altura;
    public String idade;

    public String IMC( Double peso, Double altura) {

        Double resultado = (peso / (altura * altura));
        String resultado2;

        if (resultado < 18.5) {
          return resultado2 ="abaixo do peso";
        } else if (18.5 < resultado && resultado < 24.9) {
            return resultado2 ="peso normal";
        } else if (25 < resultado && resultado < 29.9) {
            return resultado2 ="sobrepeso";
        } else if (30 < resultado && resultado < 34.9) {
            return resultado2 ="obeso";

        } else if (35 < resultado && resultado < 39.9) {
            return resultado2 ="obeso II";
        } else  {
            return resultado2 ="obeso grau 3";

        }
    }
}


