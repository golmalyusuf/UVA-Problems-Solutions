package uva.cp3.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashMap;

public class LoveCalculator10424 {

	public static void main(String[] args) throws IOException {
		//Scanner in = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		int A = 65;
		for(int i=1; i<=26; i++) {
			charMap.put((char)A++, i);
		}
		
		int a = 97;
		for(int i=1; i<=26; i++) {
			charMap.put((char)a++, i);
		}
		
		String n = "";
		String m = "";
		
		while((n = br.readLine()) != null && (m = br.readLine()) != null) {
			
			int sumOfN = getTotal(n, charMap);
			int n1 = getSingleDegitNumber(sumOfN);
			
			int sumOfM = getTotal(m, charMap);
			int m1 = getSingleDegitNumber(sumOfM);
			
			DecimalFormat df = new DecimalFormat("##.00");
			if(n1 <= m1) {
				System.out.println(df.format((double)n1/m1 * 100)+" %");
			}else {
				System.out.println(df.format((double)m1/n1 * 100)+" %");
			}
		}
	}
	
	private static int getSingleDegitNumber(int n) {
		int sum = 0;
		
		String s = ""+n;
		for(int i=0; i<s.length(); i++) {
			 sum += Integer.parseInt((""+s.charAt(i)));  
		}
		
		if(sum < 10) {
			return sum;
		}else {
			return getSingleDegitNumber(sum);
		}
	}
	
	private static int getTotal(String n, HashMap<Character, Integer> charMap) {
		int sumOfN = 0;
		for(int i=0; i<n.length(); i++) {
			char c = n.charAt(i);
			if (Character.isLetter(c))
				sumOfN += charMap.get(c);
		}
		return sumOfN;
	}

}
