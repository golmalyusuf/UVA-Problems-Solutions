package strings;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class LongestPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		
		while(t-- > 0){
			String s = in.next();
			Set set = printAllPalindromes(s);
			
			Iterator iterate = set.iterator();
			int maxlength = 0;
			String temp = "";
			while(iterate.hasNext()){
				
				String strTemp = (iterate.next().toString());
				System.out.println(strTemp);
				if(strTemp.length() > maxlength){
					maxlength = strTemp.length();
					temp = strTemp;
				}
			}
			if(set.size()==0){
				temp += s.charAt(0); 
			}
			System.out.println("==>"+temp);
		}
		 
	}
	public static Set<CharSequence> printAllPalindromes(String input) {
	    if (input.length() <= 2) {
	        return Collections.emptySet();
	    }
	    Set<CharSequence> out = new HashSet<CharSequence>();
	    int length = input.length();
	    for (int i = 1; i <= length; i++) {
	        for (int j = i - 1, k = i; j >= 0 && k < length; j--, k++) {
	        	System.out.println(input.subSequence(j, k + 1));
	            if (input.charAt(j) == input.charAt(k)) {
	                out.add(input.subSequence(j, k + 1));
	                System.out.println(input.subSequence(j, k + 1));
	            } else {
	                break;
	            }
	        }
	    }
	    return out;
	}
}
