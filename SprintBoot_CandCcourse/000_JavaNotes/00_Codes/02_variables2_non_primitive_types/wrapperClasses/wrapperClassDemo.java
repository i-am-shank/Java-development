public class wrapperClassDemo {
    public static void main(String []args) {
        int v1 = 6;
        Integer v2 = v1;  // autoboxing  (Primitive  -->  Wrapper)
        v1 = 7;
        System.out.println(v1 + " __autoboxing__ " + v2);

        Character c1 = 'a';
        char c2 = c1;  // unboxing  (Wrapper  -->  Primitive)
        c1 = 'b';
        System.out.println(c1 + " __unboxing__ " + c2);

        Short v3 = 10;
        Byte v4 = 1;
        Long v5 = 10000L;
        Boolean v6 = true;
        Float v7 = 0.83f;
        Double v8 = 0.319;
        System.out.println(v3 + " " + v4 + " " + v5);
        System.out.println(v6 + " " + v7 + " " + v8);
    }
}