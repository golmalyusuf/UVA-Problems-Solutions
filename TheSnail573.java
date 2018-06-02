package uva.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheSnail573 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		while( (s=br.readLine()) != null){
			StringTokenizer st = new StringTokenizer(s);
			double height = Double.parseDouble(st.nextToken());
			
			if(height <=0){
				break;
			}
			
			double climb = Double.parseDouble(st.nextToken());
			int drop = Integer.parseInt(st.nextToken());
			double fall = Double.parseDouble(st.nextToken())/100;
			 
			int count=0;
			double dropEnergy = climb*fall;
			double temphight = 0;
			
			while(true){
				temphight += climb;
				if(climb > 0){
					climb -= dropEnergy;
				}
				
				if(temphight > height){
					break;
				}
				
				temphight -= drop;
				
				if(temphight < 0){
					break;
				}
				count++;
			}
			if(temphight > 0){
				System.out.println("success on day "+(count+1));
			}else{
				System.out.println("failure on day "+(count+1));
			}
			
		}
	}

}
