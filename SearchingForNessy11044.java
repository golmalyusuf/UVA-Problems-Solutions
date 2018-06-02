package uva.cp3.introduction;

import java.util.Scanner;

public class SearchingForNessy11044 {
	public static void main(String asdf[]){
		 Scanner in = new Scanner(System.in);
		 int t = in.nextInt();
		 
		 while(t-- > 0){
			 int a = in.nextInt();
			 int b = in.nextInt();
			 
			 System.out.println((a/3) * (b/3));
		 }
	}
}
