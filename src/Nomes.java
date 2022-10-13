import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nomes {

    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        List <String> listaNomes = new ArrayList<>();

        String nome1;
        String nome2;
        String nome3;
        String nome4;
        String nome5;
        String nome6;
        String nome7;
        String nome8;
        String nome9;
        String nome10;

        System.out.println("Digite o primeiro nome!");
        nome1 = entrada.next();

        listaNomes.add(nome1);

        System.out.println("Digite o segundo nome!");
        nome2 = entrada.next();

        listaNomes.add(nome2);

        System.out.println("Digite o terceiro nome!");
        nome3 = entrada.next();

        listaNomes.add(nome3);

        System.out.println("Digite o quarto nome!");
        nome4 = entrada.next();

        listaNomes.add(nome4);

        System.out.println("Digite o quinto nome!");
        nome5 = entrada.next();

        listaNomes.add(nome5);

        System.out.println("Digite o sexto nome!");
        nome6 = entrada.next();

        listaNomes.add(nome6);

        System.out.println("Digite o sétimo nome!");
        nome7 = entrada.next();

        listaNomes.add(nome7);

        System.out.println("Digite o oitavo nome!");
        nome8 = entrada.next();

        listaNomes.add(nome8);

        System.out.println("Digite o nono nome!");
        nome9 = entrada.next();

        listaNomes.add(nome9);

        System.out.println("Digite o décimo nome!");
        nome10 = entrada.next();

        listaNomes.add(nome10);

        System.out.println(listaNomes);
    }
}
