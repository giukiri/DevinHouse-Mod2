import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calc3 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        List<Double> lista = new ArrayList<>();

        int option = 0 ;

        double num1;
        double num2;
        double resultado = 0;

        do {

            System.out.println("Calculadora dev");
            System.out.println("1- soma");
            System.out.println("2- subtracao");
            System.out.println("3- divisao");
            System.out.println("4- multiplicacao");
            System.out.println("5- sair");

            option = valor.nextInt();


            System.out.print("Digite um número:  ");

            num1 = valor.nextInt();

            System.out.print("Digite outro número:  ");

            num2 = valor.nextInt();

            if (option == 1) {
                resultado = num1+num2;
                System.out.println("A soma é:  " + (resultado));

            } else if (option == 2) {
                resultado = num1 - num2;
                System.out.println("A subtração é: " + (resultado));
            } else if (option == 3) {
                resultado = num1/num2;
                System.out.println("A divisão é: " + (resultado));
            } else if (option == 4) {
                resultado = num1 * num2;
                System.out.println("A multiplicação é igual a : " + (resultado));
            }

            lista.add(resultado);

        } while (option != 5);
        System.out.println("FIM");


        System.out.println("O histórico de resultados é : " + lista);

    }

}










