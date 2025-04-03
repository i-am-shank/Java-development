package strings;

public class stringDemo{
    public static void main(String []args) {
        String s1 = "hello";
//        In String Constant Pool, String literal "hello" is stored. s1 will store reference to the literal "hello"

        String s2 = "hello";
//        This will first check if "hello" is already present in String Constant pool. As it is present, s2 will store reference of same location

        System.out.println("Check if both s1 & s2 point to same memory : " + (s1 == s2));
        System.out.println("Check if both s1 & s2 have same value : " + (s1.equals(s2)));

        String s3 = new String("hello");
//        This created another literal in heap-memory, & s3 has reference to that variable

        s1 = "world";
        System.out.println(s1 + " " + s2);
    }
}