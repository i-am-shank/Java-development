public class typesOfConversion {
    public static void main(String []args) {
//        Widening / Automatic Conversion
//        ===============================
        byte var1 = 10;
        int var2 = var1; // lower datatype to higher datatype
        System.out.println("var1 = " + var1 + " , var2 = " + var2);

//        DownCasting / Explicit casting
//        ===============================
        int var3 = 200;
        byte var4 = (byte)var3;
//        it will start adding extra values to -ve most no. in the range & will go till +ve most
//        if not exhausted, it will repeat this process for the remaining sum.
        System.out.println("var3 = " + var3 + " , var4 = " + var4);

//        Promotion during Expression
//        ===============================
        byte var6 = 127;
        byte var7 = 100;
        int sumVar1 = (var6 + var7);
        System.out.println("var6 = " + var6 + " , var7 = " + var7 + " , sumVar1 = " + sumVar1);
    }
}