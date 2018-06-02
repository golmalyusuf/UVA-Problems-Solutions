package uva.cp3.introduction;

import java.util.Scanner;

public class AutomaticAnswer11547 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			 
			int n = in.nextInt();
			n = (((((n*567)/9)+7492)*235)/47)-498;
			if(n<0){
				n*= -1;
			}
			n = n/10;
			n = n%10;
			System.out.println(n);
		}
	}
}
