package variableArguments;

public class variableArgDemo {
//    nums  -->  this will be considered as a list. Can iterate on it too.
//    only 1 variable argument can be present in a method.
    public static int sum(int ...nums) {
        int ans = 0;
        for(int x: nums) {
            ans += x;
        }
        return ans;
    }

    public static void main(String []args) {
        int n1 = sum(1, 2);
        int n2 = sum(1, 2, 3);
        int n3 = sum(1, 2, 3, 4, 5);
        int n4 = sum();
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
    }
}