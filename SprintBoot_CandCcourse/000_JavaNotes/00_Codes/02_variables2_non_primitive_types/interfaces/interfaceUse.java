package interfaces;

public class interfaceUse {
    public static void main(String []args) {
        myInterface obj = new interfaceDemo();
        myInterface obj2 = new interfaceDemo2();
        System.out.println(obj.greetMethod());
        System.out.println(obj2.greetMethod());
    }
}