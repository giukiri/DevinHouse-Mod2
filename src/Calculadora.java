import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner calculadora = new Scanner(System.in);

            int num1;
            int num2;

            int soma;

            System.out.print("Digite um número:  ");
            num1 = calculadora.nextInt();

            System.out.print("Digite outro número:  ");

            num2 = calculadora.nextInt();

            soma = num1+num2;

            System.out.println(soma);


    }
}
