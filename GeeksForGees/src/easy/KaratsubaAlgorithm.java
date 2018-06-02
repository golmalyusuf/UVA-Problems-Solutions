package easy;

import java.util.Scanner;

public class KaratsubaAlgorithm {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0){
			String s1 = in.next();
		    String s2 = in.next();
		    int n1 = Integer.parseInt(s1,2);
		    int n2 = Integer.parseInt(s2,2);
		    
		    n1 = n1*n2;
			System.out.println(n1);
		}
	}

}
