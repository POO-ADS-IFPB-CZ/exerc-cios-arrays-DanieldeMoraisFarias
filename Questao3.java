import java.util.Scanner;

public class Questao3{
    public static void main(String[] args){
        double vetor[] = new double[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira as 10 notas:");
        vetor[0] = scanner.nextDouble();
        vetor[1] = scanner.nextDouble();
        vetor[2] = scanner.nextDouble();
        vetor[3] = scanner.nextDouble();
        vetor[4] = scanner.nextDouble();
        vetor[5] = scanner.nextDouble();
        vetor[6] = scanner.nextDouble();
        vetor[7] = scanner.nextDouble();
        vetor[8] = scanner.nextDouble();
        vetor[9] = scanner.nextDouble();

        Double media = (vetor[0] + vetor[1] + vetor[2] + vetor[3] + vetor[4] + vetor[5] + vetor[6] + vetor[7] + vetor[8] + vetor[9])/10;
        int acima = 0;
        int abaixo = 0;
        for(int i=0;i<10;i++){
            if(vetor[i]-media >= 0){
                acima++;
            }
            else{
                abaixo++;
            }
        }
        System.out.println("A media das notas eh"+media);
        System.out.println(acima+"notas estao acima da media!");
        System.out.println(abaixo+"notas estao abaixo da media!");
    }
}