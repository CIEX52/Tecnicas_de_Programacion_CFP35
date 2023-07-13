public class IvanCarneiro_L3_10_11_12_13_14 {
    public static void main(String[] args) {
        System.out.println("\nEjercicio 10\n\nDados n1=5, n2=10 y n3=20.\r\n" + //
                            "Informar:\r\n" + //
                            "a) n1+n2\r\n" + //
                            "b) n3-n1\r\n" + //
                            "c) n1*n3\r\n" + //
                            "d) n3/n2\n");
        int n1 = 5;
        int n2 = 10;
        int n3 = 20;
        System.out.println("a) "+(n1+n2));
        System.out.println("b) "+(n3-n1));
        System.out.println("c) "+(n1*n3));
        System.out.println("d) "+(n3/n2));
        System.out.println("\n\n");

        System.out.println("\nEjercicio 11\n\nDados n1=10, n2=20 y n3=30, Informar :\r\n" + //
                            "Informar:\r\n" + //
                            "a) El total\r\n" + //
                            "b) El promedio\r\n" + //
                            "c) El resto entre n2 y n1\r\n");
        n1 = 10;
        n2 = 20;
        n3 = 30;
        System.out.println("a) "+(n1+n2+n3));
        System.out.println("b) "+(n1+n2+n3)/3);
        System.out.println("c) "+(n2%n1));
        System.out.println("\n\n");

        System.out.println("\nEjercicio 12\n\nDados n1=true, n2=false y n3=true. Informar:\r\n" + //
                            "Informar:\r\n" + //
                            "a) n1 ^ n2\r\n" + //
                            "b) (n1 & !n2) | n3"+ //
                            "c) (n1 | n2) & !n3\r\n");
        
        System.out.println("a) false");
        System.out.println("b) true");
        System.out.println("c) false");
        System.out.println("\n\n");

        System.out.println("\nEjercicio 13\n\n"+//
        "Declarar dos variables n1=5 y n2=10.\r\n" + //
        "Utilizando concatenación entre las variables y los literales, mostrar en pantalla la siguiente expresión:\r\n" + //
        "n1 es igual a 5, n2 es igual a 10 y n1 más n2 es igual a 15.\r\n");
        n1=5; n2=10;
        System.out.println("n1 es igual a "+n1+", n2 es igual a "+n2+" y n1 mas n2 es igual a "+(n1+n2)+".");
        System.out.println("\n\n");

        System.out.println("\nEjercicio 12\n\n"+//
        "Haciendo uso de la constante IVA=21, calcular el precio con iva de los siguientes productos e informar:\r\n" + //
        "a) remera:\t$59.90\r\n" + //
        "b) pantalón:\t$99.90\r\n" + //
        "c) campera:\t$149.90\r\n");

        final double IVA = 1.21;
        System.out.println("Precios con IVA_21:\n");
        System.out.println("remera:\t\t$"+(59.9*IVA));
        System.out.println("pantalón:\t$"+(99.9*IVA));
        System.out.println("campera:\t$"+(149.9*IVA));
    }
}

