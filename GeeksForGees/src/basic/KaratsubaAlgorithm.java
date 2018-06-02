package basic;

import java.util.Scanner;

public class KaratsubaAlgorithm {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b = in.nextLine();
		
		int i = Integer.parseInt(a,2);
		int j = Integer.parseInt(b,2);
		int sum = i*j;
		
		System.out.println(sum);
	}

}
