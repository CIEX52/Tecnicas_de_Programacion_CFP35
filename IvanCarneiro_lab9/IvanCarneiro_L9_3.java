package IvanCarneiro_lab9;
import java.util.Scanner;
public class IvanCarneiro_L9_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Ingrese dos números");
            double num1 = in.nextDouble();
            double num2 = in.nextDouble();
            
            if (num1 == num2) {
                System.out.println("Los numeros ingresados son iguales");
            }
            else if (num1 > num2) {
                System.out.println("El numero mayor es "+num1);
                System.out.println("El numero menor es "+num2);
            }
            else {
                System.out.println("El numero mayor es "+num2);
                System.out.println("El numero menor es "+num1);
            }
        } 
        finally {
            in.close();
        }
}
}

