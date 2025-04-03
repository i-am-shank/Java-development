import java.util.Scanner;

public class factorialTrailingZeroes {
    public static int trailingZeroes(int n) {
        int count = 0;
        while(n >= 5) {
            count += (n / 5);
            n /= 5;
//            as in any factorial..
//            no. of 2  >=  no. of 5  (in product)
//            And, no. of 0 can only be possible from (2 & 5  ..  2*5 = 10  ..  1 zero)
//            Therefore, no. of 0  ==  no. of 5 in product.
        }
        return count;
    }

    public static void main(String []args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int ans = trailingZeroes(n);
            System.out.println(ans);
        }
    }
}