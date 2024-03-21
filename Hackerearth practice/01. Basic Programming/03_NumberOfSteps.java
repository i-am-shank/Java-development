import java.util.Scanner;

class NumberOfSteps {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0; i<n; i++) {
      a[i] = sc.nextInt();
    }
    int b[] = new int[n];
    for(int i=0; i<n; i++) {
      b[i] = sc.nextInt();
    }
    int count = 0;
    boolean done = false;
    while(true) {
      int minVal = Integer.MAX_VALUE;
      for(int i=0; i<n; i++) {
        minVal = Math.min(a[i], minVal);
      }
      // Attempt to make all <= minVal
      int equal = 0; 
      // count a[i] == minVal .. after operation
      int curr = 0; // count current-iter operations
      for(int i=0; i<n; i++) {
        while(a[i]>=b[i] && a[i]>minVal) {
          a[i] -= b[i];
          count++;
        }
        if(a[i] == minVal) {
          equal++;
        }
      }
      if(equal == n) {
        done = true;
        break;
      }
      // Else continue another iteration
      if(curr == 0) {
        break;
      }
    }
    if(done == true) {
      System.out.println(count);
    }
    else {
      System.out.println(-1);
    }
    sc.close();
  }
}
