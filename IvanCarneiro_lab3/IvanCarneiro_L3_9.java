/* Operadores Lógicos */
public class IvanCarneiro_L3_9 {
    public static void main(String[] args) {
        System.out.println("A");
        boolean n1 = true;
        boolean n2 = false;
        boolean n3 = !n1;
        boolean n4 = !n2;
        System.out.println(n3);
        System.out.println(n4);

        System.out.println("B");
        n3 = n1 & n2;
        n4 = n1 | n2;
        System.out.println(n3);
        System.out.println(n4);

        System.out.println("C");
        n3 = !(n1 & n2);
        n4 = !(n1 | n2);
        System.out.println(n3);
        System.out.println(n4);

        System.out.println("D");
        n3 = !n1 & n2;
        n4 = !n1 | n2;
        System.out.println(n3);
        System.out.println(n4);
    }
}
/* Operadores Lógicos
	n1      n2      n3      n4
A	true	false	false	True
B       			false	True
C		        	true	False
D			        false	False
 */
