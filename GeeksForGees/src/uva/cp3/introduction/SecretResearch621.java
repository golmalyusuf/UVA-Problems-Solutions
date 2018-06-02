package uva.cp3.introduction;

import java.util.Scanner;

public class SecretResearch621 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while(t-- > 0) {
			String s = in.next();
			if(s.contains("*")) {
				break;
			}
			
			if(s.equals("1") || s.equals("4") || s.equals("78")) {
				System.out.println("+");
			} else if(s.length() >= 2 && ((s.charAt(s.length()-1) == '5') && (s.charAt(s.length()-2) == '3')))  {
				System.out.println("-");
			}else if(s.length() >= 2 && ((s.charAt(0) == '9') && (s.charAt(s.length()-1) == '4')))  {
				System.out.println("*");
			}else { 
				System.out.println("?");
			}
		}
	}

}
