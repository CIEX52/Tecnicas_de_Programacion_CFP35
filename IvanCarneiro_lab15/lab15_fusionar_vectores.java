// Leer dos series de 10 enteros, que estarán ordenados crecientemente. Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.

import java.util.Arrays;
import java.util.Random;


public class lab15_fusionar_vectores {

    public static int rand(int min, int max) {
		
        if (min > max || (max - min > Integer.MAX_VALUE)) {
			throw new IllegalArgumentException("Rango inválido!");
		}
		return new Random().nextInt(max - min) + min;
	}

    public static void main(String[] args){
        int [] vector_1 = new int[10];
        int [] vector_2 = new int[10];
        int [] fusion = new int[20];

        // Llenar vectores
        int min = -99;
        int max = 99;
		System.out.println("LLenando vectores...");
		for(int i=0; i < vector_1.length; i++){
			vector_1[i] = rand(min, max);
            vector_2[i] = rand(min, max);
		}

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