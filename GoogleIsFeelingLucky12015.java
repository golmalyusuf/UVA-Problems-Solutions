package uva.cp3.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GoogleIsFeelingLucky12015 {

	public static void main(String[] args) throws NumberFormatException, IOException { 
		Reader.init(System.in);
		int noOftestCases = Reader.nextInt();
		GoogleEntry sites[] = new GoogleEntry[10];
		
		for(int i=0; i<10; i++) {
			sites[i] = new GoogleEntry();
		}
		
		for(int i=0; i<noOftestCases; i++) {
			int currMax = 0; 
			System.out.println("Case #"+(i+1)+":");
			for(int j=0; j<10; j++) {
				sites[j].website = Reader.next();
				sites[j].rank = Reader.nextInt();
				if(sites[j].rank > currMax) {
					currMax = sites[j].rank;
				}
			}
			for(int j=0; j<10; j++) {
				if(sites[j].rank == currMax) {
					System.out.println(sites[j].website);
				}
			}
		}
	}
}

class GoogleEntry {
	public String website;
	public int rank;
}

class Reader{
	static BufferedReader br;
	static StringTokenizer st;
	
	static void init(InputStream in) throws IOException {
		br = new BufferedReader(new InputStreamReader(in));
		st = new StringTokenizer("");
	}
	
	static String next() throws IOException {
		while(!st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine());
		}
		
		return st.nextToken();
	}
	
	static int nextInt() throws NumberFormatException, IOException {
		return Integer.parseInt(next());
	}
	
	static double nextDouble() throws NumberFormatException, IOException {
		return Double.parseDouble(next());
	}
}