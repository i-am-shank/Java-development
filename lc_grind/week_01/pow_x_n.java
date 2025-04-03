import java.util.Scanner;

public class pow_x_n {
    public static double myPow(double x, int n) {
        if(n == 0) {
            return 1.0;
        }
        double ans = myPow(x, n/2);
        if((n%2) == 0) {
            ans *= ans;
        }
        else {
            ans *= ans;
            if(n > 0) {
                ans *= x;
            }
            else {
                ans /= x;
            }
        }
        return ans;
    }

    public static void main(String []args) {
        try(Scanner sc = new Scanner(System.in)) {
            double x = sc.nextDouble();
            int n = sc.nextInt();
            double ans = myPow(x, n);
            System.out.printf("%.5f", ans);
        }
    }
}