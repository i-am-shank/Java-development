import java.util.Scanner;

public class reverseString {
	public static void reverseString(char[] s) {
        int n = s.length;
        for(int i=0; i<(n/2); i++) {
        	char temp = s[i];
        	s[i] = s[(n-1)-i];
        	s[(n-1)-i] = temp;
        }
    }

	public static void main(String []args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			char []s = new char[n];
			String dummy = sc.nextLine();
			String str = sc.nextLine();
			for(int i=0; i<n; i++) {
				s[i] = str.charAt(i);
			}
			reverseString(s);
			for(int i=0; i<n; i++) {
				System.out.print(s[i] + " ");
			}
			System.out.println();
		}
	}
}