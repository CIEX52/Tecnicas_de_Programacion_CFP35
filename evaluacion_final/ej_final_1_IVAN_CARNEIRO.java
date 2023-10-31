// La estructura principal While, se emplea ya que no sabemos cuantas iteraciones hará el usuario, a su vez teniendo en cuenta la consigna de implementar un menú con opciones, el suo de la estructura switch simplifica la codificación de las dintintas funcionaladides solicitdas. Se optó por arrays de 1 y otra de multilpes dimensiones para almacenar los datos de participantes y marcas, y estructuras for para iterar sobre los arrays. 

import java.util.Scanner;

public class ej_final_1_IVAN_CARNEIRO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion = 0;
        String[] participantes = new String[10];
        float[][] marcas = new float[3][10];
        int dorsal = 0;
        int nroDorsal = 0;

        System.out.println("\nPROGRAMA DE GESTIÓN DE PARTICIPANTES PARA LA COMPETECIÓN DE SALTO EN LARGO\n");

        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    if ((participantes.length - dorsal) != 0) {
                        System.out.println("Ingrese Apellido y Nombre del participante:");
                        System.out.println("Apellido:");
                        String apellido = in.next();
                        System.out.println("Nombre:");
                        String nombre = in.next();

                        participantes[dorsal] = apellido.toUpperCase() + " " + nombre.toUpperCase();
                        System.out.println("\nIngrese mejor marca del año 2002 del participante-" + (dorsal + 1) + " "
                                + participantes[dorsal] + "\nuse coma , para separa decimales Ej.: 7,65");
                        marcas[2][dorsal] = in.nextFloat();
                        System.out.println("\nIngrese mejor marca del año 2001 del participante-" + (dorsal + 1) + " "
                                + participantes[dorsal]);
                        marcas[1][dorsal] = in.nextFloat();
                        System.out.println("\nIngrese mejor marca del año 2000 del participante-" + (dorsal + 1) + " "
                                + participantes[dorsal]);
                        marcas[0][dorsal] = in.nextFloat();

                        System.out.println("\nHa inscrito correctamente al Participante-" + (dorsal + 1) + " "
                                + participantes[dorsal]);
                        System.out.println("Mejor marca del 2002: " + marcas[2][dorsal] + "m");
                        System.out.println("Mejor marca del 2001: " + marcas[1][dorsal] + "m");
                        System.out.println("Mejor marca del 2000 " + marcas[0][dorsal] + "m");
                        dorsal++;
                        System.out.println("\nPlazas restante para incripciones: " + (participantes.length - dorsal)
                                + "\n---------------------------------------------\n\n");
                    } else {
                        System.out.println("\nYA NO QUEDAN PLAZAS PARA INCRIPCIONES\nElija otra opción");
                    }
                    opcion = 0;
                    break;

                case 2:
                    if (dorsal != 0) {
                        System.out.println("DATOS DE PARTICIPANTES INSCRIPTOS\n");
                        for (int i = 0; i < dorsal; i++) {
                            System.out.println("\n0" + (i + 1) + " " + participantes[i]);
                            System.out.println("Mejor marca del 2002: " + marcas[2][i] + "m");
                            System.out.println("Mejor marca del 2001: " + marcas[1][i] + "m");
                            System.out.println("Mejor marca del 2000 " + marcas[0][i] + "m");
                        }
                        System.out.println("----------------------------------------\n");
                    } else {
                        System.out.println("Todavía no ha participantes inscriptos.");
                        System.out.println("----------------------------------------\n");
                    }
                    opcion = 0;
                    break;

                case 3:
                    if (dorsal != 0) {
                        System.out.println("Cantidad de participantes incriptos " + (dorsal));
                        System.out.println("Ingrese el nro de dorsal");
                        nroDorsal = in.nextInt();
                        if ((nroDorsal > 0 & nroDorsal <= (dorsal))) {
                            System.out.println(
                                    "MARCAS DEL PARTICIPANTE " + nroDorsal + " " + participantes[nroDorsal] + "\n");
                            System.out.println("Mejor marca del 2002: " + marcas[2][nroDorsal - 1] + "m");
                            System.out.println("Mejor marca del 2001: " + marcas[1][nroDorsal - 1] + "m");
                            System.out.println("Mejor marca del 2000 " + marcas[0][nroDorsal - 1] + "m");
                            System.out.println("---------------------------------------------\n");
                        } else {
                            System.out.println("El nro de dorsal debe ser del 1 al " + dorsal);
                        }
                    }else{
                        System.out.println("Todavía no ha participantes inscriptos.");
                        System.out.println("----------------------------------------\n");
                    }
                    opcion = 0;
                    break;

                default:
                    System.out.println(
                            "Ingrese un nro para elegir una opción.\n\n1. Inscribir un participante.\n2. Mostrar listado de datos.\n3. Mostrar del dorsal ingresado.\n4- Finalizar el programa.\n");
                    opcion = in.nextInt();
                    System.out.println("--------------------------------------------------\n\n");
            }
        }
        in.close();
        System.out.println("PROGRAMA FINALIZADO");
    }
}