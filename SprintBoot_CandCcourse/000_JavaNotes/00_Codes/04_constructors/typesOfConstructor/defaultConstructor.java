package typesOfConstructor;

public class Person {
    int age;
}

public class defaultConstructor {
    public static void main(String []args) {
        Person p1 = new Person();
        System.out.println("p1 age = " + p1.age);
    }
}