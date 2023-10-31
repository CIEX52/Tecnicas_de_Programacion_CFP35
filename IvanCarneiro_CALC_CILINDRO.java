import java.util.Scanner;

public class IvanCarneiro_CALC_CILINDRO {

    public static double calculoVolumen(double r, double h){
        return Math.PI*r*r*h;
    }

    public static double calculoArea(double r, double h){
        return 2*Math.PI*r*h + 2*Math.PI*r*r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radio = 0;
        double altura = 0;
        String caso = "";

        while ((caso != "a") | (caso != "v") | (caso != "z")){
            if (caso == "a" | caso == "v"){
            switch (caso) {
                case "a":
                System.out.println("El aréa de cilindro es: "+calculoArea(radio, altura));
                break;
            
                case "v": 
                System.out.println("El volumen de cilindro es: "+calculoVolumen(radio, altura));
                break;

                default:
                System.out.println("Los datos ingresados son incorrectos...");
                }
            }
        }
        in.close();
    }
}
// Realizar una función que calcule (muestre en pantalla) el área o el volumen de un cilindro, según
// se especifique. Para distinguir un caso de otro se le pasará el carácter 'a' (para área) o 'v'
// (para el volumen). Además hemos de pasarle a la función el radio y la altura.

// V = pi * r**2 * h
// pi = 3.1416

// 2π * r * h + 2π * r²

