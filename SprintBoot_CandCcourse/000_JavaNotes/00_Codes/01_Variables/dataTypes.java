public class dataTypes {
    public static void main(String args[]) {

//        char -------------
        char var1 = 65;  // this will also assign 'A'
        char var2 = 'D';
        char var3 = '\0';  // NULL value
        System.out.println(var3);
        System.out.println("var1 = " + var1 + " , var2 = " + var2 + " , var3 = " + var3);

//        int -------------
        int var4 = 16;
        int var5 = -35;
        long var6 = 105l; // can assign value to long both ways .. simple no. OR no. followed by 'l'.
        System.out.println("var4 = " + var4 + " , var5 = " + var5 + " , var6 = " + var6);

//        float -------------
        float var7 = .3f;
        float var8 = .1f;
        float var9 = (var7 - var8);
        System.out.println("var9 = var7 + var8 = " + var7 + " + " + var8 + " = " + var9);

//        We never use float & double , when we need precise values of decimals. Instead use BigInteger .

//        boolean ------------
        boolean var10 = true;
        boolean var11 = false;
        System.out.println("var 10 = " + var10 + " , var11 = " + var11);
    }
}