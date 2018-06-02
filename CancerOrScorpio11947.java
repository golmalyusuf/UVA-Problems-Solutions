package uva.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CancerOrScorpio11947 {

	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		SimpleDateFormat sdf = new SimpleDateFormat("MMddyyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat sdf3 = new SimpleDateFormat("MMMM-dd");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy");

		Map<String, String> mapForzodiac = new HashMap<String, String>();
		mapForzodiac.put("01-21|02-19", "Aquarius");
		mapForzodiac.put("02-20|03-20", "Pisces");
		mapForzodiac.put("03-21|04-20", "Aries");
		mapForzodiac.put("04-21|05-21", "Taurus");
		mapForzodiac.put("05-22|06-21", "Gemini");
		mapForzodiac.put("06-22|07-22", "Cancer");
		mapForzodiac.put("07-23|08-21", "Leo");
		mapForzodiac.put("08-22|09-23", "Virgo");
		mapForzodiac.put("09-24|10-23", "Libra");
		mapForzodiac.put("10-24|11-22", "Scorpio");
		mapForzodiac.put("11-23|12-22", "Sagittarius");
		mapForzodiac.put("12-23|01-20", "Capricorn");

		int t = Integer.parseInt(in.readLine());
		int count = 0;
		while (t-- > 0) {
			String input = in.readLine();
			Date date = sdf.parse(input);
			String bornDate = "";
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			c.add(Calendar.DATE, 40 * 7);

			date = c.getTime();
			bornDate = sdf2.format(c.getTime());

			Set  set = mapForzodiac.entrySet();
			Iterator iterator = set.iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				String words  = entry.getKey().toString();
				String split[] = words.split("|");
				
				//Date strDate = sdf3.parse(words[0]);
				//Date endDate = sdf3.parse(words[1]);
				
				System.out.println(entry.getKey()+" "+split[0]);
			}

			System.out.println((++count) + " " + bornDate);
		}
	}

}
