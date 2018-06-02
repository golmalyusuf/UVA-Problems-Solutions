package uva.introduction;

import java.util.Scanner;

public class RelationalOperator11172 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		if(t < 15){
			while(t-- > 0){
				int i = in.nextInt();
				int j = in.nextInt();
				
				if(i>j){
					System.out.println(">");
				}else if(i<j){
					System.out.println("<");
				}else if(i==j){
					System.out.println("=");
				}
			}
		}
	}
}
