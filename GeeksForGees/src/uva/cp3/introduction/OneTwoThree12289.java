package uva.cp3.introduction;

import java.util.Scanner;

public class OneTwoThree12289 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(in.hasNext()){
			String s = in.nextLine();
			//System.out.println("==>"+s);
			if(s.length() > 0){
				if(s.length() == 5){
					System.out.println(3);
				} else if((s.charAt(0)=='o' && s.charAt(2) == 'e') || 
						(s.charAt(0)=='o' && s.charAt(1) == 'n') ||
						(s.charAt(0)=='o' && s.charAt(2) == 'e') ||
						(s.charAt(0)=='o' && s.charAt(2) == 'n') ||
						(s.charAt(1)=='e' && s.charAt(2) == 'n') ||
						(s.charAt(1)=='n' && s.charAt(2) == 'e') ){
					System.out.println(1);
				} else {
					System.out.println(2);
				} 
				--t;
			}
			 
			if(t== 0){
				break;
			} 
		}
	}
}
