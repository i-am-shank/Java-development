import java.util.Scanner;
import java.lang.Math;

public class reverseInteger {
    public static int reverse(int x) {
        boolean isNegative = (x < 0);
        long n1=x, n=x, n2=0;
        n = Math.abs(n);
        while(n != 0) {
            long digit = (n % 10);
            n /= 10;
            n2 = ((n2*10) + digit);
        }
        if(isNegative == true) {
            n2 = (-1 * n2);
            if(n2 < Integer.MIN_VALUE) {
                return 0;
            }
            else {
                return (int)n2;
            }
        }
        else {
            if(n2 > Integer.MAX_VALUE) {
                return 0;
            }
            else {
                return (int)n2;
            }
        }
    }

    public static void main(String []args) {
        try(Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int ans = reverse(x);
            System.out.println(ans);
        }
    }
}