package uva.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class EventPlanning11559 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while( (s=br.readLine()) != null){
			StringTokenizer st = new StringTokenizer(s);
			
			int person = Integer.parseInt(st.nextToken());
			int balance = Integer.parseInt(st.nextToken());
			int hotels = Integer.parseInt(st.nextToken());
			int weekend = Integer.parseInt(st.nextToken());
			int availableBedForWeekend[] = new int[weekend]; 
			
			ArrayList<Integer> cost = new ArrayList<Integer>();
			int count = 0;
			 
			for(int i=0; i<hotels; i++){
				int p = Integer.parseInt(br.readLine()) ;
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<weekend; j++){
					availableBedForWeekend[j] = Integer.parseInt(st.nextToken());
					int emptyBeds = availableBedForWeekend[j];
					if(emptyBeds >= person && (p*person) <= balance){
						if(p*person > 0){
							cost.add(p*person);
						}
					}
				}
			}
			
			Collections.sort(cost);
			 
			if(!cost.isEmpty() ){
				System.out.println(cost.get(0));
			}else{
				System.out.println("stay home");
			}
			
		}
	}

}
