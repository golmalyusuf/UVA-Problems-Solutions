package uva.cp3.introduction;

import java.util.Scanner;

public class EmoogleBalance12279 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int count = 0;
		while(in.hasNext()){
			int n = in.nextInt();
			
			if(n == 0){
				break;
			}
			int treat = 0;
			
			for(int i=0; i<n; i++){
				int m = in.nextInt();
				if(m == 0){
					treat -= 1;
				}else{
					treat += 1;
				}
			}
			
			System.out.println("Case "+(++count)+": "+treat);
		}
	}
}
