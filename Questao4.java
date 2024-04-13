import java.util.ArrayList;
import java.util.Scanner;

public class Questao4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        while(true){
            int valInserido= scanner.nextInt();
            scanner.nextLine();
            if(valInserido<0){
                int tamanho = numeros.size();
                double valorTotal=0;
                for(int valor : numeros){
                    valorTotal += valor;
                }
            double media = valorTotal/tamanho;
            System.out.println("O tamanho eh"+tamanho+"e a media eh"+media);
                System.exit(0);
            }
            else{
                numeros.add(valInserido);
            }

        }
    }
}