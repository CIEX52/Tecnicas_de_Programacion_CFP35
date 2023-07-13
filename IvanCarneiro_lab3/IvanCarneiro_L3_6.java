public class IvanCarneiro_L3_6 {
    public static void main(String[] args) {
        System.out.println("A");
        int x = 5;
        int y = 10;
        int multi = 1;
        int division = 1;
        System.out.println(x);
        System.out.println(y);
        System.out.println(multi);
        System.out.println(division);

        System.out.println("B");
        multi = x * y;
        division = x / y;
        System.out.println(multi);
        System.out.println(division);

        System.out.println("C");
        multi = x * x;
        division = y / y;
        System.out.println(multi);
        System.out.println(division);

        System.out.println("D");
        multi = x * y * x;
        division = y / x;
        System.out.println(multi);
        System.out.println(division);

        System.out.println("E");
        multi= x * (-y);
        division= y / (-x);
        System.out.println(multi);
        System.out.println(division);
    }
}

/*
Operadores Aritméticos con asignación múltiple (producto y división)
	x	y   mult	div
A	5   10  1	    1
B	5	10  50  	0.5
C	5	10  25	    1
D	5	10  250	    2
E	5	10  -50	-   2
*/