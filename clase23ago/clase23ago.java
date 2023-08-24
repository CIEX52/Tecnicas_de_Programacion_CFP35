package clase23ago;
// import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;



public class clase23ago {

    public static float rand(float min, float max) {
		
        if (min > max || (max - min > Float.MAX_VALUE)) {
			throw new IllegalArgumentException("Rango inválido!");
		}
		return new Random().nextFloat(max - min) + min;
	}
    public static void main(String[] args){
        // Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo. Cada grupo (o clase) está compuesto por 5 alumnos. Se pide leer las notas del primer, segundo y tercer trimestre de un grupo. Debemos mostrar al final: la nota media del grupo en cada trimestre, y la media del alumno que se encuentra en la posición N (N se lee por teclado).

        Scanner in = new Scanner(System.in);
        float [] priTri = new float [5];
        float [] segTri = new float [5];
        float [] terTri = new float [5];

        // Llenar vectores
        float min = 1;
        float max = 10;
        System.out.println("LLenando vectores...");
        for (int i=0; i < priTri.length; i++) {
            priTri[i] = rand(min, max);
            segTri[i] = rand(min, max);
            terTri[i] = rand(min, max);
		}

        System.out.println("Notas 1er trimestre");
        System.out.println(Arrays.toString(priTri));
        System.out.println("Notas 2do trimestre");
        System.out.println(Arrays.toString(segTri));
        System.out.println("Notas 3er trimestre");
        System.out.println(Arrays.toString(terTri));

    }
}
