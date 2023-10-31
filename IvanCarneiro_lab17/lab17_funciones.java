import java.util.Scanner;

public class lab17_funciones {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("\nCALCULADORA DE NRO MAXIMO\n");
        System.out.println("Cuantos nro quiere ingresar?");
        int len = in.nextInt();
        int [] vector = new int[len];
        System.out.println("\n");

        for (int i = 0; i < vector.length; i++) {
            System.out.println("ingrese un nro ");
            vector[i] = in.nextInt();
        }

        mostrar_maximo2(vector);
        in.close();
    }

    public static void print_mensaje(int n){
        for (int i = 0; i < n; i++){
            System.out.println("Modulo ejecutandose...");
        }
    }

    public static void mostrar_maximo (int n1, int n2){
        if (n1 > n2){
            System.out.println(n1+" es mayor que "+n2);
        } 
        else if (n1 < n2){
            System.out.println(n2+" es mayor que "+n1);
        }
        else {
            System.out.println("Los numeros son iguales "+n1+" = "+n2);
        }
    }

    public static void mostrar_maximo2 (int [] array){
        int may = array[0];
        int pos = 0;

        for (int i = 0; i < array.length; i++){
            if (may < array[i]){
                may = array[i];
                pos = i;
            }
        }

        System.out.println("\nEl nro 3 mayor ingresado es: "+may+" en la posicion "+(pos+1));
    }
}

/*
    1. Realizar una función, a la que se le pase como parámetro un número N, 
    y muestre por pantalla Nveces, el mensaje: “Módulo ejecutándose”

    2.1 Diseñar una función que tenga como parámetros dos números, y que calcule el máximo.
    2.2 Una versión que calcule el máximo de una tabla de n elementos.
*/