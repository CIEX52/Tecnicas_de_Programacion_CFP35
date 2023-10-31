// Crear una matriz de tamaño 8x6: todos sus elementos deben ser 0 salvo, 
// los de los bordes que deben ser 1. Mostrarla por pantalla.

import java.util.Arrays;
import java.util.Scanner;

public class ej_final_2_3_IVAN_CARNEIRO {
    public static void main(String[] args) {

        
        System.out.println("\n--------------------------------------------------\n\n");

        System.out.println("Ejercicio final Nro. 3\n");
        // Leer 10 numeros enteros. Guardar en otra tabla los elementos pares de la
        // primera,
        // y a continuación los elementos impares.
        // Realizar dos versiones: una trabajando con los valores y otra trabajando con
        // los índices.
        
        Scanner in = new Scanner(System.in);
        // int[] enteros = new int[10];
        int[] enteros = {2, 7, 24, 88, 19, 85, 56, 18, 3, 71};
        int[] par = new int[enteros.length];
        int[] impar = new int[enteros.length];
        int j = 0;
        int k = 0;

        System.out.println("Ver.1 - SEPARACION PAR-IMPAR POR VALORES\n");
        System.out.println("Ingrese 10 nro enteros:\n");
        for (int i = 0; i < enteros.length; i++) {
            // enteros[i] = in.nextInt();
            if (enteros[i] % 2 == 0) {
                par[j] = enteros[i];
                j++;
            } else {
                impar[k] = enteros[i];
                k++;
            }
        }

        System.out.println("\nValores Pares " + Arrays.toString(par));
        System.out.println("\nValores Impares " + Arrays.toString(impar));
        System.out.println("\n--------------------------------------------------\n");

        int[] par2 = new int[enteros.length / 2];
        int[] impar2 = new int[enteros.length / 2];
        j = 0;
        k = 0;
        System.out.println("Ver.2 - SEPARACION PAR-IMPAR POR ÍNDICES\n");
        System.out.println("Ingrese 10 nro enteros:\n");
        for (int i = 0; i < enteros.length; i++) {
            // enteros[i] = in.nextInt();
            if (i % 2 == 0) {
                par2[j] = enteros[i];
                j++;
            } else {
                impar2[k] = enteros[i];
                k++;
            }
        }

        System.out.println("\nÍndices Pares " + Arrays.toString(par2));
        System.out.println("\nÍndices Impares " + Arrays.toString(impar2));

        in.close();
    }
}

// En estos dos ejercicios, se emplea la estructura FOR ya que al saber la
// cantidad de iteraciones a realiar,
// nos permite mayor control del flujo del programa.
// Ejercicio 2: Se compruba mediante un IF si el íncice alctual es 0 (borde izq)
// o -1 (borde derecho), para asignar el valor 1.

// Ejercicio 3: Para almacenar los resultados enter la Ver. 1 y 2, se opta por
// inicializar arrays nuevos y no utilizar
// los mismos (par e impar) ya que la longitud será distinta, en la Ver.1,
// los arrays par o impar pueden ser igual o menor a enteros, pero en la Ver.2,
// al trabajar con los índices serán si o si la mitad de
// array enteros.