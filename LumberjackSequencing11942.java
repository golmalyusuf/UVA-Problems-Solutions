package uva.cp3.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LumberjackSequencing11942 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		System.out.println("Lumberjacks:");
		while(t-- > 0) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			int lengthOfbeard[] = new int[10];
			
			String order="";
			for(int i=0; i<10; i++) {
				if(st.hasMoreTokens()) {
					//System.out.print(st.nextToken()+"  ");
					lengthOfbeard[i] = Integer.parseInt(st.nextToken());
				}
			}
			
			boolean sameValue = false;
			for(int j = 0; j<lengthOfbeard.length; j++) {
			    if(j+1 < lengthOfbeard.length && lengthOfbeard[j] != lengthOfbeard[j+1]) {
			    	//System.out.println("same value "+j+"   "+lengthOfbeard[j]+"  "+(j+1)+"  "+lengthOfbeard[j+1]+"   "+lengthOfbeard.length+"    " );
			    	sameValue = false;
			    	break;
				}else {
					sameValue = true;
				}
			}
			//System.out.println("same value "+sameValue);
			if(!sameValue) {
				for(int j = 0; j<lengthOfbeard.length; j++) {
					 
					if(j+1 < lengthOfbeard.length && lengthOfbeard[j] > lengthOfbeard[j+1]) {
						order = "Unordered";
						break;
					} 
				}
				boolean check = true;
				/*29 18 66 51 23 39 87 15 42 97*/
				if(order.equals("Unordered")) {
					//System.out.println("INSIDE ");
					for(int j = 0; j<lengthOfbeard.length; j++) {
						if((j+1) < lengthOfbeard.length && lengthOfbeard[j] < lengthOfbeard[j+1]) {
							order = "Unordered";
							//System.out.println("HELLO FUCKKER ");
							check = false;
							break;
						}else { 
							check= true;
							order = "Ordered";
						}
					}
				}
			}
			
			if(sameValue) {
				order = "Unordered";
			}
			
			if(order.equals("")) {
				order = "Ordered";
			}
			System.out.println(order);
		}
	}

}
