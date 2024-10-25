public class kindOfVariables {

//    member variable -------------
    int memberVariable;

//    static variable -------------
    static int staticVariable = 100;

//    default constructor -------------
    kindOfVariables() {

    }

//    constructor parameter (Ex.: a) --------------
    kindOfVariables(int a) {
        memberVariable = a;
    }

    public static void main(String []args) {
//        local variable --------------
        byte localVariable = 100;
    }

//        method parameter --------------
    public int dummyMethod2(int a, int b) {
        return (a+b);
    }
}
