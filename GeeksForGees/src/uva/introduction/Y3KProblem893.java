package uva.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class Y3KProblem893 {

	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=bf.readLine()) != null){
			StringTokenizer st = new StringTokenizer(s);
			int days = Integer.parseInt(st.nextToken());
			int dd = Integer.parseInt(st.nextToken());
			int mm = Integer.parseInt(st.nextToken());
			int yy = Integer.parseInt(st.nextToken());
			if(days == 0 && dd == 0){
				break;
			}
			
			String dt = "";
			SimpleDateFormat sf = new SimpleDateFormat("d/M/yyyy");
			Date date = sf.parse(dd+"/"+mm+"/"+yy);
			
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			c.add(Calendar.DATE, days);  // number of days to add
			dt = sf.format(c.getTime());
			
			System.out.println(dt.replaceAll("/", " "));
		}
	}

}
