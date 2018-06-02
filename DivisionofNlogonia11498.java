package uva.cp3.introduction;

import java.util.Scanner;

public class DivisionofNlogonia11498 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		while(in.hasNextLine()){
			int t = in.nextInt();
			if(t == 0){
				break;
			}

			int x = in.nextInt();
			int y = in.nextInt();
			
			for(int i=0; i<t; i++){
				int x1 = in.nextInt();
				int y1 = in.nextInt();
				
				if(x == x1 || y==y1){
					System.out.println("divisa");
				} else if(x < x1 && y < y1){
					System.out.println("NE");
				} else if( x > x1 && y < y1){
					System.out.println("NO");
				} else if( x > x1 && y > y1){
					System.out.println("SO");
				} else if( x < x1 && y > y1){
					System.out.println("SE");
				}
			}
			
		}
	}

}
