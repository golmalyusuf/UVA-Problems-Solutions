package basic;

import java.util.Scanner;

public class FirstAndLastOccurrencesOfX {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		while(t-- > 0 && in.hasNextLine()){
			int n = in.nextInt();
			int x = in.nextInt();
			String s =  in.nextLine();

			String words[] = s.split(" ");
			for(int i = 0; i< n;i++){
				 System.out.println(words[i]);
			}
		}
	}

}
