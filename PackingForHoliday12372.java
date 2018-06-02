package uva.cp3.introduction;

import java.util.Scanner;

public class PackingForHoliday12372 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int count = 0;
		
		while(t-- > 0){
			int i = in.nextInt();
			int j = in.nextInt();
			int z = in.nextInt();
			
			if(i<= 20 && j <= 20 && z <= 20){
				System.out.println("Case "+ ++count +": "+"good");
			}else{
				System.out.println("Case "+ ++count +": "+"bad");
			}
		}
	}
}
