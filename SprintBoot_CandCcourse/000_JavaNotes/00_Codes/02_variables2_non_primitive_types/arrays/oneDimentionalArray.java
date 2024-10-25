package arrays;

import java.util.Scanner;

public class oneDimentionalArray{
    public static void main(String []args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int []arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            arr[2] = 100; // accessing any index
            for(int it: arr) {
                System.out.print(it + " ");
            }
            System.out.println();
        }
    }
}