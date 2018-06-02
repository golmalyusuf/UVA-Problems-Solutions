package uva.cp3.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JumpingMario11764 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine().trim());
		int countCase = 0;
		while(t-- > 0) {
			int n = Integer.parseInt(br.readLine().trim());
			int arr[] = new int[n];
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			 
			for(int i=0; i<n; i++) {
				if(st.hasMoreTokens()) {
					arr[i] = Integer.parseInt(st.nextToken().trim());
				}
			}
			int high = 0;
			int low = 0;
			for(int i=1; i<n; i++) {
				if(arr[i-1] < arr[i] ) {
					high++;
				}else if(arr[i-1] > arr[i]) {
					low++;
				}else {
					
				}
			}
			
			System.out.println("Case "+(++countCase)+": "+high +" "+low);
		}
	}
}
