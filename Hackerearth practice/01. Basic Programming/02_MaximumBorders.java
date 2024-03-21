import java.util.Scanner;

class MaximumBorders {
  public static void main(String a[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t > 0) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      // String arr[] = new String[n];
      String dummy = sc.nextLine(); // just to skip 1st line
      char arr[][] = new char[n][m];
      for(int i=0; i<n; i++) {
        String row = sc.nextLine();
        char rowArr[] = row.toCharArray();
        for(int j=0; j<m; j++) {
          arr[i][j] = rowArr[j];
        }
      }
      // Find max row-wise ------------
      int maxVal=0;
      for(int i=0; i<n; i++) {
        int curr=0;
        boolean prev = true;
        for(int j=0; j<m; j++) {
          if(arr[i][j] == '#') {
            // Black
            if(prev == true) {
              curr++;
            }
            else {
              curr = 1; // start counting
              prev = true;
            }

            // Update max
            maxVal = Math.max(maxVal, curr);
          }
          else {
            // White
            prev = false;
            curr = 0; // re-initialise
          }
        }
      }

      // Find col-wise -----------
      for(int j=0; j<m; j++) {
        int curr = 0;
        boolean prev = true;
        for(int i=0; i<n; i++) {
          if(arr[i][j] == '#') {
            // Black
            if(prev == true) {
              curr++;
            }
            else {
              curr = 1; // start counting
            }

            // Update max
            maxVal = Math.max(maxVal, curr);
          }
          else {
            // White
            prev = false;
            curr = 0; // re-initialise
          }
        }
      }

      System.out.println(maxVal);
      t--;
    }
    sc.close();
  }
}
