import java.util.Scanner;

public class palindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        int n1=x, n2=0;
        while(x != 0) {
            int digit = (x % 10);
            x /= 10;
            n2 = ((n2*10) + digit);
        }
        return (n1 == n2);
    }

    public static void main(String []args) {
        try(Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            boolean ans = isPalindrome(x);
            System.out.println(ans);
        }
    }
}
