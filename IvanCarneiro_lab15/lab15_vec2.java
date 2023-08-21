// Leer dos series de 10 enteros, que estarán ordenados crecientemente. Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.

import java.util.Arrays;
import java.util.Random;


public class lab15_vec2 {

    public static int[] llenaVector(int[] vector){
		System.out.println("LLenando vectores...");
		for(int i=0; i < vector.length; i++){
			vector[i] = new Random().nextInt(99);
		}
		return vector;
    }
    
    public static void main(String[] args){
        int [] vector_1 = new int[10];
        int [] vector_2 = new int[10];
        int [] fusion = new int[20];

        llenaVector(vector_1);
        llenaVector(vector_2);
        System.out.println("Vector 1 >>> "+Arrays.toString(vector_1));
        System.out.println("Vector 2 >>> "+Arrays.toString(vector_2)+"\n");

        System.arraycopy(vector_1, 0, fusion, 0, fusion.length/2);
        System.arraycopy(vector_2, 0, fusion, 10, fusion.length/2);
        System.out.println("Vector Fusion\n"+Arrays.toString(fusion)+"\n");

        boolean desordered = true;
        while (desordered) {
            // ordena valores
            System.out.println("Ordenando...");
            int len = fusion.length;
            for (int i = 0; i < len-1; i++) {
                int j = i+1;
                if (fusion[i] > fusion[j]){
                    int aux = fusion[j];
                    fusion[j] = fusion[i];
                    fusion[i] = aux;
                } 
                else {
                    continue;
                }
            }

            for (int i = 0; i < len-1; i++) {
                int j = i+1;
                if (fusion[i] > fusion[j]){
                    desordered = true;
                    break;
                } 
                else {
                    desordered = false;
                    continue;
                }
            }
        }
        System.out.println("\nfusion de vec1 y vec2, oredenado\n"+Arrays.toString(fusion));
    }
}