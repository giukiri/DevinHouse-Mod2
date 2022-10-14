import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nomes2 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        List<String> listaNomes  = new ArrayList<>();

        int tamanho= 0;

        String nome;

        do {

        System.out.println("Digite um nome!");
        nome = entrada.next();

        listaNomes.add(nome);

        tamanho = listaNomes.size();





    }
        while(tamanho < 10);

       for(int i=0; i<tamanho; i++){
           System.out.println((i+1) + "=" + listaNomes);
       }
}
}
