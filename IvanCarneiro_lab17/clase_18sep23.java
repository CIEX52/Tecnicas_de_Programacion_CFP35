import java.util.Scanner;

public class clase_18sep23 {
    public static int HallarMaximo(int n1, int n2){
        int max = 0;
        if (n1 > n2){
            max = n1;
        }
        else if (n1 < n2){
            max = n2;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese dos números...");
        num1 = in.nextInt();
        num2 = in.nextInt();

        System.out.println("El máximo es "+HallarMaximo(num1, num2));
        in.close();
    }
}

