// Dado el vector {10,20,5,15,30,20}
// 1. Informar el vector de la forma: "Índice: X, Valor: Y".
// 2. Totalizar el vector e informar el total.
// 3. Informar el contenido de las posiciones impares (por ejemplo, posiciones 1,3,5, etc.)
// 4. Informar el mayor número.
// 5. Informar cuántas veces aparece el número 20.

import java.util.Arrays;

public class lab16_1 {

    public static void main(String[] args){
        int [] vector = {10,20,5,15,30,20};
        int sum = 0;
        int may = 0;

        System.out.println("Vector dado: "+Arrays.toString(vector)+"\n");

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Índice: "+i+", Valor: "+vector[i]);
            sum+= vector[i];
        }
        System.out.println("\nTotalizado de vector: "+sum);
    }
}