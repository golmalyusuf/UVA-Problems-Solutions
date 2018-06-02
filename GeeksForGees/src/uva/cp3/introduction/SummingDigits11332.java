package uva.cp3.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SummingDigits11332 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String input1 = br.readLine();
			
			if(input1.trim().equals("0")) {
				break;
			}
			int i = Integer.parseInt(input1.trim());
			int s = breakValues(i);
			System.out.println(s);
		}
	}
	
	static int breakValues(int input1){
		int sum = 0;
		
		while(input1 > 0) {
			int a = input1 %10;
			sum += a; 
			input1 /= 10;
		}
		
 		if(sum < 10) {
			return sum; 
		} else {
			return breakValues(sum);
		}
	}

}
