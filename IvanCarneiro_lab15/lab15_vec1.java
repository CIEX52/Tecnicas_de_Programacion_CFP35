import java.util.Scanner;

public class lab15_vec1 {
    public static void main(String[] args) {
        // try {
        //     int [] sumador = new int[3];
        //            int [] sumador = new int[3];

        //     int [] mivector = new int [5];
        //     for (int i = 0; i < mivector.length; i++){
        //         System.out.println("Ingrese un nro entero");
        //         mivector[i] = in.nextInt();
        //         if (mivector[i] < 0){
        //             suma += mivector[i];
        //             cont++;
        //         }
        //         else if (mivector[i] > 0){
        //         }
        //     }
        //     System.out.println("Media de postivos: " + suma/cont);
        // } 
        // finally {
        //     in.close();
        // }
        int [] tablaA = {1,2,3,4,5,6,7,8,9,10};
        int [] tablaB = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
        int [] tablaC = new int[20];
        int j = 0;
        for (int i = 0; i < tablaA.length; i++){
            tablaC[j] = tablaA[i];
            tablaC[j+1] = tablaB[i];
            j+=2;
        }

        for (int i=0; i < tablaC.length; i++){
            System.out.println(tablaC[i]);
        }
    }
}

