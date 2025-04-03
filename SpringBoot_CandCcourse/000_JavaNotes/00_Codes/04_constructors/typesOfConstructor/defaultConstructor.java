package typesOfConstructor;

import typesOfConstructor.Person;

public class defaultConstructor {
    public static void main(String []args) {
        Person p1 = new Person();
        System.out.println("p1 age = " + p1.age);
        System.out.println("p1 marks = " + p1.marks);
        System.out.println("p1 firstChar = " + p1.firstChar);

//        As default constructor of Person-class is called, all instance variables will be assigned default values.
    }
}
