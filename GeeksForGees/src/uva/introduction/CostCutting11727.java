package uva.introduction;

import java.util.Scanner;

public class CostCutting11727 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int count = 0;
		while(t-- > 0){
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			count++;
			if((a>b && b>c) || (c>b && b>a)){
				System.out.println("Case "+count+": "+b);
			}else if((b>a && a>c) || (c>a && b<a)){
				System.out.println("Case "+count+": "+a);
			}else if((c>b && a>c) || (b>c && a<c)){
				System.out.println("Case "+count+": "+c);
			} 
		} 	
	}
}
