import java.util.Scanner;

public class singleNumber {
    public static int singleNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i=0; i<n; i++) {
            ans = (ans ^ nums[i]);
        }
//        all duplicate nos. will cancel out each other to 0, in XOR.
        return ans;
    }

    public static void main(String []args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int []nums = new int[n];
            for(int i=0; i<n; i++) {
                nums[i] = sc.nextInt();
            }
            int ans = singleNumber(nums);
            System.out.println(ans);
        }
    }
}