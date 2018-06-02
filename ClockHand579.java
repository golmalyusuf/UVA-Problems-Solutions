package uva.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class ClockHand579 {

	public static void main(String[] args) throws IOException  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("0.000");
		String s;
		while((s=in.readLine()) !=null){
			String words[] = s.split(":");
			double hour = Double.parseDouble(words[0]);
			double minutes = Double.parseDouble(words[1]);
			
			if(hour == 0 && minutes == 0){
				break;
			}
			double avgHour = (hour*30)+(((double)minutes/60)*30);
			 
			double avgMinute = minutes*6;
			
			double angle = avgHour - avgMinute;
			if(angle < 0){
				angle*= -1;
			}
			if(angle > 180){
				angle = 360 - angle;
			}
			
			System.out.println(df.format(angle));
		}
		
	}

}
