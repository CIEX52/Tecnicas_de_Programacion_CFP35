import java.util.Scanner;

// Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los números están ordenados de forma creciente, decreciente, o si están desordenados. //

public class IvanCarneiro_lab17ago23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean ordenado = true;
        try {
            int [] serie = new int[10];
            System.out.println("Ingresa 10 números enteros cualesquiera:");
            for (int i = 0; i < serie.length; i++){
                serie[i] = in.nextInt();
            }
            for (int i = 0; i < (serie.length-1); i++) {
                if (i == 0){ // primer iteración
                    if ((serie[i] > serie[i+1]) || (serie[i]==serie[i+1])){
                        continue;
                    }
                }
                else{ // partir de 2da iteración
                    if (((serie[i-1] > serie[i]) || (serie[i-1] == serie[i])) & ((serie[i] > serie[i+1])||(serie[i] == serie[i+1]))){ // mayor a menor
                            continue;
                        }
                    else if (((serie[i-1] < serie[i])||(serie[i-1] == serie[i])) & ((serie[i] < serie[i+1])||(serie[i-1] == serie[i]))){ // menor a mayor
                            continue;
                        }
                    else{
                        System.out.println("La serie está desordenada");
                        ordenado = false;
                        break;
                    }
                }
            }
        }
        finally {
            if (ordenado){
                    System.out.println("La serie está ordenada");
                }
            in.close();
        }
    }
}