import java.util.Scanner;
import java.lang.Math;

public class integerToRoman {
	public static int numDigits(int n) {
		int count = 0;
		while(n != 0) {
			n /= 10;
			count++;
		}
		return count;
	}

	public static String intToRoman(int num) {
        String ans = "";
        while(num != 0) {
        	int x = numDigits(num);
        	int firstDigit = (num / (int)Math.pow(10, x-1));
        	if(firstDigit == 9) {
        		if(num >= 900) {
        			ans += "CM";
        			num -= 900;
        		}
        		else if(num >= 90) {
        			ans += "XC";
        			num -= 90;
        		}
        		else if(num >= 9) {
        			ans += "IX";
        			num -= 9;
        		}
        		else {
        			break;
        		}
        	}
        	else if(firstDigit == 4) {
        		if(num >= 400) {
        			ans += "CD";
        			num -= 400;
        		}
        		else if(num >= 40) {
        			ans += "XL";
        			num -= 40;
        		}
        		else if(num >= 4) {
        			ans += "IV";
        			num -= 4;
        		}
        		else {
        			break;
        		}
        	}
        	else {
        		if(num >= 1000) {
        			ans += "M";
        			num -= 1000;
        		}
        		else if(num >= 500) {
        			ans += "D";
        			num -= 500;
        		}
        		else if(num >= 100) {
        			ans += "C";
        			num -= 100;
        		}
        		else if(num >= 50) {
        			ans += "L";
        			num -= 50;
        		}
        		else if(num >= 10) {
        			ans += "X";
        			num -= 10;
        		}
        		else if(num >= 5) {
        			ans += "V";
        			num -= 5;
        		}
        		else if(num >= 1) {
        			ans += "I";
        			num -= 1;
        		}
        		else {
        			break;
        		}
        	}
        }
        return ans;
    }

	public static void main(String []args) {
		try(Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			String ans = intToRoman(num);
			System.out.println(ans);
		}
	}
}