import java.util.Scanner;

public class Calc3 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        int option = 0 ;

        double num1;
        double num2;
        boolean sair = false;

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
                System.out.println("A soma é:  " + (num1 + num2));
            } else if (option == 2) {
                System.out.println("A subtração é: " + (num1 - num2));
            } else if (option == 3) {
                System.out.println("A divisão é: " + (num1 / num2) + "e o resto da divisão é: " + (num1 % num2));
            } else if (option == 4) {
                System.out.println("A multiplicação é igual a : " + (num1 * num2));
            }

            if (option == 5) {
                sair = true;
            }
        } while (sair != true);
        System.out.println("FIM");

    }

}










