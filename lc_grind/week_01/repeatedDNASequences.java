import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class repeatedDNASequences {
	public static List<String> findRepeatedDnaSequences(String s) {
        int n = s.length();
        Map<String, Integer> freq = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for(int i=0; i<=(n-10); i++) {
        	String curr = s.substring(i, i+10);
        	// System.out.println(curr);
        	if(freq.containsKey(curr) == true) {
        		freq.put(curr, freq.get(curr) + 1);
        	}
        	else {
        		freq.put(curr, 1);
        	}
        }
        for(String str: freq.keySet()) {
        	if(freq.get(str) > 1) {
        		ans.add(str);
        	}
        }
        return ans;
    }

    public static void main(String []args) {
    	try(Scanner sc = new Scanner(System.in)) {
    		String s = sc.nextLine();
    		List<String> ans = findRepeatedDnaSequences(s);
    		for(int i=0; i<ans.size(); i++) {
    			System.out.print(ans.get(i) + " ");
    		}
    		System.out.println();
    	}
    }
}