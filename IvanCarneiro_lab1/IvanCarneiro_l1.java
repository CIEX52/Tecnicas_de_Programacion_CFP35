public class IvanCarneiro_l1 {
    public static void main(String[] args) {
        boolean bl=true;                        // variable booleana
        int in=1234567890;                      // variable entera
        byte bt=127;                            // variable byte
        long ln=9876543210123456l;              // variable long
        float fl=3.14159f;                      // variable float
        String str="Técnicas de Programación";  // variable string

        System.out.println("\nVARIABLES DE TIPO DECLARATIVO\n");
        System.out.println("boolean: "+bl);
        System.out.println("integer: "+in);
        System.out.println("byte: "+bt);
        System.out.println("long: "+ln);
        System.out.println("float: "+fl);
        System.out.println("string: "+str+"\n");

        var var1=false;
        var var2=99;
        var var3=1.618f;
        var var4=998877665544332211l;
        var var5="eureka";
        System.out.println("VARIABLES TIPO VAR\n");
        System.out.println("var1 = "+var1+" "+((Object)var1).getClass().getSimpleName());
        System.out.println("var1 = "+var2+" "+((Object)var2).getClass().getSimpleName());
        System.out.println("var1 = "+var3+" "+((Object)var3).getClass().getSimpleName());
        System.out.println("var1 = "+var4+" "+((Object)var4).getClass().getSimpleName());
        System.out.println("var1 = "+var5+" "+((Object)var5).getClass().getSimpleName());
        System.out.println("\n");

        System.out.println("REASIGNANDO VALORES\n");
        bl=false;                                           // boolean
        in=88;                                              // integer
        str="Programación - Técnicas de Programación";      // string
        var4=778899l;                                       // long
        System.out.println("Variable bl: "+bl);
        System.out.println("Variable in: "+in);
        System.out.println("Variable str: "+str);
        System.out.println("Variable var4: "+var4);

    }
}
