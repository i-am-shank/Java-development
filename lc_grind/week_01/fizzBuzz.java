import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class fizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int x = (i+1);
            if((x%3 == 0)  &&  (x%5 == 0)) {
                ans.add("FizzBuzz");
            }
            else if(x%3 == 0) {
                ans.add("Fizz");
            }
            else if(x%5 == 0) {
                ans.add("Buzz");
            }
            else {
                ans.add(Integer.toString(x));
            }
        }
        return ans;
    }

    public static void main(String []args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            List<String> ans = fizzBuzz(n);
            for(int i=0; i<ans.size(); i++) {
                System.out.print(ans.get(i) + " ");
            }
            System.out.println();
        }
    }
}