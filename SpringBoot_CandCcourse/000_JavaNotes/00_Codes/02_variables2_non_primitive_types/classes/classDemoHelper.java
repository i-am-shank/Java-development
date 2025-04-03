package classes;

public class classDemoHelper {
    public static void main(String []args) {
//        the object is created in the Heap memory
//        And, variable cd1 holds the reference to the actual memory
//        variable cd1 is stored in Stack memory
        classDemo cd1 = new classDemo();

        cd1.memberVar1 = 7;
        System.out.print("Values of memberVar1 : " + cd1.memberVar1 + " , ");

        cd1.setMemberVar1(10);
        System.out.print(cd1.memberVar1 + " , ");

        modify(cd1);
        System.out.println(cd1.memberVar1);
    }

    private static void modify(classDemo classDemoObj) {
        classDemoObj.memberVar1 = 18;
        return;
    }
}
