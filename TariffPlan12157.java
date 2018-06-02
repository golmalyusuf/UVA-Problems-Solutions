package uva.cp3.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TariffPlan12157 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine().toString());
		int caseno = 1;
		while(t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int arr[] = new int[n];
			 
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			
			for(int i=0; i<n; i++) {
				if(st.hasMoreTokens())
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			
			int totalMoney1 = 0;
			int totalMoney2 = 0;
			for(int i=0; i<n; i++) {
				 int time = arr[i];
				 int countA = 0;
				 int countB = 0;
				 int money1 = 0;
				 int money2 = 0;
				 while(time > countA-1) {
					 countA+= 30;
					 money1++;
				 }
				 
				 while(time > countB-1) {
					 countB+= 60;
					 money2++;
				 }
				 
				 totalMoney1 += money1 *= 10;
				 totalMoney2 += money2 *= 15;
			}
			String com = "";
			int min = Math.min(totalMoney1, totalMoney2);
			if(totalMoney1 < totalMoney2) {
				com = "Mile";
				
			} else if (totalMoney1 > totalMoney2) { 
				com = "Juice";
			} else { 
				com = "Mile Juice";
			}
			System.out.println("Case "+(caseno++)+": "+ com +" "+min );
		}
	}
}
