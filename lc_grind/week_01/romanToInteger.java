import java.util.Scanner;

public class romanToInteger {
	public static int romanToInt(String s) {
        int n = s.length();
        int ans = 0;
        for(int i=0; i<n; i++) {
        	if(s.charAt(i) == 'M') {
        		ans += 1000;
        	}
        	else if(s.charAt(i) == 'D') {
        		ans += 500;
        	}
        	else if(s.charAt(i) == 'C') {
        		// if followed by 'D'  ->  CD = 400
        		if(i<(n-1) && s.charAt(i+1)=='D') {
        			ans += 400;
        			i++;
        		}
        		// if followed by 'M'  ->  CM = 900
        		else if(i<(n-1) && s.charAt(i+1)=='M') {
        			ans += 900;
        			i++;
        		}
        		else {
        			ans += 100;
        		}
        	}
        	else if(s.charAt(i) == 'L') {
        		ans += 50;
        	}
        	else if(s.charAt(i) == 'X') {
        		// if followed by 'L'  ->   XL = 40
        		if(i<(n-1) && s.charAt(i+1)=='L') {
        			ans += 40;
        			i++;
        		}
        		// if followed by 'C'  ->   XC = 90
        		else if(i<(n-1) && s.charAt(i+1)=='C') {
        			ans += 90;
        			i++;
        		}
        		else {
        			ans += 10;
        		}
        	}
        	else if(s.charAt(i) == 'V') {
        		ans += 5;
        	}
        	else if(s.charAt(i) == 'I') {
        		// if followed by 'V'  ->  IV = 4
        		if(i<(n-1) && s.charAt(i+1)=='V') {
        			ans += 4;
        			i++;
        		}
        		// if followed by 'X'  ->  IX = 9
        		else if(i<(n-1) && s.charAt(i+1)=='X') {
        			ans += 9;
        			i++;
        		}
        		else {
        			ans += 1;
        		}
        	}
        }
        return ans;
    }

	public static void main(String []args) {
		try(Scanner sc = new Scanner(System.in)) {
			String s = sc.nextLine();
			int ans = romanToInt(s);
			System.out.println(ans);
		}
	}
}