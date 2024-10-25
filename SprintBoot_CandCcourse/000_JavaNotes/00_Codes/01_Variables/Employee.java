public class Employee {
    byte var;  // default value = 0
//    (default values are only assigned to class member variables)
//    (if we'll try to leave any variables inside method unassigned, it'll throw some error)

    public void dummyMethod() {
        System.out.println("var = " + var);
    }
}