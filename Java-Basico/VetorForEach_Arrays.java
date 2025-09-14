package vetor;

import java.util.Arrays;

public class VetorForEach_Arrays {
    public static void main(String[] args) {
        int vetor[] = {3, 2, 8, 7, 5, 4};
        Arrays.sort(vetor); 
        int posicao = Arrays.binarySearch(vetor, 8);
        for (int valor : vetor) { 
            System.out.println(valor);
        }
        System.out.println("O valor 8 está na posição "+ (posicao + 1));
    }
}