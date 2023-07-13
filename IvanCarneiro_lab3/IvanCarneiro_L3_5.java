public class IvanCarneiro_L3_5 {
    public static void main(String[] args) {
        
        System.out.println("A");
        int x = 5;
        int y = 10;
        int suma = 0;
        int resta = 0;
        System.out.println(x);
        System.out.println(y);
        System.out.println(suma);
        System.out.println(resta);

        System.out.println("B");
        suma = x + y;
        resta = x - y;
        System.out.println(suma);
        System.out.println(resta);

        System.out.println("C");
        suma = x + x;
        resta = y - y;
        System.out.println(suma);
        System.out.println(resta);

        System.out.println("D");
        suma = x + y + x;
        resta = x - x - 20;
        System.out.println(suma);
        System.out.println(resta);

        System.out.println("E");
        suma = y + x + x;
        resta = -x - y -y ;
        System.out.println(suma);
        System.out.println(resta);

        /* 5. Operadores Aritméticos con asignación múltiple (suma y resta)
                    x	y   suma	resta
                A	5	10	0	    0
                B	5	10	15	    -5
                C	5	10	10	    0
                D	5	10	20	    -20
                E	5	10	20	    -5
        */
    }
}

