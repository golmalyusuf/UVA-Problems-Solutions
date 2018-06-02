package uva.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LoansomeCarBuyer10114 {

	
	public static void main(String[] args)throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s = br.readLine()) != null){
			StringTokenizer st = new StringTokenizer(s);
			
			int duration = Integer.parseInt(st.nextToken());
			double downPayment = Double.parseDouble(st.nextToken()); 
			double loan = Double.parseDouble(st.nextToken());
			int depreciations = Integer.parseInt(st.nextToken());
			
			if(duration < 0){
				break;
			}
			double[] values = new double[duration+1];
			for(int i = 0; i < depreciations; i++){
				st = new StringTokenizer(br.readLine());
				int month = Integer.parseInt(st.nextToken());
				double rate = 1 - Double.parseDouble(st.nextToken());
				
				for(int j = month; j < values.length; j++){
					values[j] = rate;
				}
			}
			
			double monthlyPayment = loan/duration;
			double owe = loan;
			double carval =  (loan + downPayment) * values[0];
			int month = 1;
			
			
			while(owe > carval && month < values.length){
				owe -= monthlyPayment;
				carval*= values[month];
				month++;
			}
			 month--;
			
			if(month == 1){
				System.out.println("1 month");
			}else{
				System.out.println(month+" months");
			}
		}
	}

}
