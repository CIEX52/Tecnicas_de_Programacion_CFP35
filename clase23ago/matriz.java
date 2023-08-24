package clase23ago;
import java.util.Arrays;
import java.util.Random;
// import java.util.Scanner;


//  Crear y cargar una tabla de tamaño 4x4, mostrar la suma de cada fila y de cada columna.
public class matriz {

    public static int rand(int min, int max) {
		//* Generador de nros random. Modificar métodos para otros tipos de datos (float, double, etc.)*/
        if (min > max || (max - min > Integer.MAX_VALUE)) {
			throw new IllegalArgumentException("Rango inválido!");
		}
		return new Random().nextInt(max - min) + min;
	}
    public static void main(String[] args){
        int min = 0;
        int max = 10;

        // Scanner in = new Scanner(System.in);
        int [][] mtz44 = new int[4][4];

        System.out.println("Llenando matriz...");
        for (int i = 0; i < mtz44.length; i++) {
            for (int j = 0; j < mtz44[i].length; j++) {
                mtz44[i][j] = rand(min, max);
            }
        }

        int sumFil = 0;
        int [] sumCol = new int[mtz44.length];

        for (int i = 0; i < mtz44.length; i++) {
            for (int j = 0; j < mtz44[i].length; j++){
                sumFil+=mtz44[i][j];
                sumCol[j]+= mtz44[i][j]; 
            }
        
            System.out.println("Suma de elementos de fila "+i+": "+sumFil);
        }

        for (int i = 0; i < sumCol.length; i++){
            System.out.println("Suma de elementos de col "+i+": "+sumCol[i]);
        };

        System.out.println("\n");

        // Print matriz
        for (int i = 0; i < mtz44.length; i++) {
            // // Imprime cada elemnto de matriz
            // for (int j = 0; j < matriz[i].length; j++) {
            //     System.out.println(matriz[i][j]);
            // }

            // Mostrar Matriz completa
            System.out.println(Arrays.toString(mtz44[i]));
        }
    }
}
