package uva.cp3.introduction;

import java.util.HashMap;
import java.util.Scanner;

public class BlowingFusesSuggestions661 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0; 
		while(true) {
			int n = Integer.parseInt(in.next().trim());
			int m = Integer.parseInt(in.next().trim());
			int c = Integer.parseInt(in.next().trim());
			
			if(n == 0 && m == 0 && c == 0) {
				break;
			}
			int sum = 0;
			int max = 0;
			HashMap<Integer, String> n1Map = new HashMap<Integer, String>();
			HashMap<Integer, Integer> m1Map = new HashMap<Integer, Integer>();
			
			for(int i=0; i< n; i++) {
				int nn = Integer.parseInt(in.next().trim());
				n1Map.put(i+1, nn+" "+"off");
			}
			
			for(int i=0; i<m; i++) {
				int mm = Integer.parseInt(in.next().trim());
				String s = n1Map.get(mm);
				String words[] = s.split(" ");
				
				if(words[1] != null && !words[1].isEmpty()) {
					if(words[1].equals("off")) {
						sum += Integer.parseInt(words[0]);
						n1Map.put(mm, words[0]+" "+"on");
						if(max < sum) {
							max = sum;
						}
					}else {
						sum -= Integer.parseInt(words[0]); 
						n1Map.put(mm, words[0]+" "+"off");
					}
				}
				
				
			}
			
			System.out.println("Sequence "+ ++count);
			if(max > c) {
				System.out.println("Fuse was blown.");
			}else {
				System.out.println("Fuse was not blown.");
				System.out.println("Maximal power consumption was "+max+" amperes.");
			}
			System.out.println();
		}
	}
}
