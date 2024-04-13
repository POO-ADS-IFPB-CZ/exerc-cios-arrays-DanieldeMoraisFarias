public class Questao2{
    public static void main(String[]args){
        int vetor[] = new int[30];
        int i;
        int aux=0;
        for(i=0;i<30;i++){
            if(i == 0){
                vetor[i] = 1;
            }
            else{
                vetor[i] = vetor[i-1] + aux;
                aux = vetor[i-1];
            }
            System.out.println(vetor[i]);
        }
    }
}
