import java.util.Scanner;

public class twoDimArray {
    public static void main(String []args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt(), m=sc.nextInt();
            int [][]arr = new int[n][m];
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            if(n>=1 && m>=1) {
                arr[0][0] = 100;
                arr[n-1][m-1] = 1000;
            }
            for(int[] it: arr) {
                for(int it2: it) {
                    System.out.print(it2 + " ");
                }
                System.out.println();
            }
        }
    }
}