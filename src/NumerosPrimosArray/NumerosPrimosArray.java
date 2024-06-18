package NumerosPrimosArray;

import java.util.Scanner;

public class NumerosPrimosArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamanho = 0 , max = 100 , min = 30;
        int range = max - min;
        int[] vetor = new int[20];
        int[] vetorPrimos = new int[20];
        
        // popula vetor
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int)(Math.random()*(range) + min);
        }
        
        // printa vetor
        System.out.println("Array com numeros sorteados:");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");
        
        vetorPrimos = gerarVetorPrimos(vetor);
        
        System.out.println("Array com os numeros primos:");
        for(int i = 0; i < vetorPrimos.length; i++){
            if(vetorPrimos[i] != 0){
                System.out.print(vetorPrimos[i] + " ");
            }
        }
        System.out.println("");
    }
    
    // Gera vetor de primos baseado no vetor inserido
    public static int[] gerarVetorPrimos(int[] vetor){
        int[] vetorPrimos = new int[20];
        int contadorVetorPrimos = 0;
        
        for(int i = 0; i < vetor.length; i++){
            if(ehPrimo(vetor[i]) == true){
                vetorPrimos[contadorVetorPrimos++] = vetor[i];
            }  
        }
        return vetorPrimos;
    }
    
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
