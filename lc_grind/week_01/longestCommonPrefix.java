import java.util.Scanner;
import java.lang.Math;

public class longestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        int minLength = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
        	minLength = Math.min(minLength, strs[i].length());
        }
        String ans = "";
        for(int i=0; i<minLength; i++) {
        	boolean flag = true;
        	char curr = strs[0].charAt(i);
        	for(int j=0; j<n; j++) {
        		if(strs[j].charAt(i) != curr) {
        			flag = false;
        			break;
        		}
        	}
        	if(flag == true) {
        		ans += curr;
        	}
        	else {
        		break;
        	}
        }
        return ans;
    }

	public static void main(String []args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			String dummy = sc.nextLine();
			String []strs = new String[n];
			for(int i=0; i<n; i++) {
				strs[i] = sc.nextLine();
			}
			String ans = longestCommonPrefix(strs);
			System.out.println(ans);
		}
	}
}