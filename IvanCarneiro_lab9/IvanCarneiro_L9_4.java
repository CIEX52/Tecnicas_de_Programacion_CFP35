/* Pedir tres números . calcular la multiplicación de los dos mayores. dividir el mayor por el menor */
package IvanCarneiro_lab9;
import java.util.Scanner;
public class IvanCarneiro_L9_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Ingrese tres números");
            double num1 = in.nextDouble();
            double num2 = in.nextDouble();
            double num3 = in.nextDouble();

            double mayor = num1;
            double medio = 0;
            double menor = 0;

            if (num1 > num2) {
                if (num2 > num3){
                    medio = num2;
                    menor = num3;
                }
                else if (num3 > num2){
                    medio = num3;
                    menor = num2;
                }
                else {
                    medio = num2;
                    menor = num2;
                }
            }
            else if (num3 > num2){
                if (num2 > num1){
                    medio = num2;
                    menor = num1;
                }
                else if (num1 > num2){
                    medio = num1;
                    menor = num2;
                }
                else {
                    medio = num2;
                    menor = num2;
                }
            }
            else if (num3 > num2){
            }

            System.out.println("El producto de los dos números mayores: "+mayor*medio);
            if (menor != 0){
                System.out.println("El cociente entre mayor y menor: ");
            }
            else {
                System.out.println("Número menor = 0. No se puede realizar una división por cero (0)"); 
            }
        } finally {
            in.close();
        }
    }
}