package methodsIntro;

import java.util.Scanner;

public class methodsDemo{
//    Below methods can help us in writing re-usable code.
    public static int sum(int val1, int val2) {
        int total = (val1 + val2);
        System.out.println("Sum of " + val1 + " & " + val2 + " = " + total);
        return total;
    }

    public static int productSum(int val1, int val2, int val3) {
        int sum1 = sum(val1, val2);
        int sum2 = sum(val2, val3);
        int sum3 = sum(val3, val1);
        int product = (sum1 * sum2 * sum3);
        return product;
    }

    public static void main(String []args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            int ans = productSum(n1, n2, n3);
            System.out.println("Product of sum = " + ans);
        }
    }
}