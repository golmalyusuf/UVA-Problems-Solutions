package uva.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class MobileCasanova12085 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		int count=0;
		while((s=in.readLine()) != null){
			int n = Integer.parseInt(s);
			if(n == 0){
				break;
			}
			
			ArrayList<String> numberString = new ArrayList<String>();
			
			for(int i=0; i<n; i++){
				numberString.add(in.readLine());
			}
			
			long[] numbersInt = new long[numberString.size()];
			
			int countelement = 0;
			for(String num: numberString){
				if(num.charAt(0) == '0'){
					numbersInt[countelement++] = (Integer.parseInt(num));
				}
			}
			
			Arrays.sort(numbersInt);
			
			numberString = null;
			
			System.out.println("Case "+(++count)+":");
			for(int i = 0; i<numbersInt.length;i++ ){
				if((i+1)<numbersInt.length && numbersInt[i]+1 != numbersInt[i+1]){
					numberString.add("0"+numbersInt[i]);
				}else{
					int temp1 = i;
					 
					for(; temp1 < numbersInt.length; temp1++){
						if((temp1+1)<numbersInt.length && numbersInt[temp1]+1 != numbersInt[temp1+1]){
							break;
						}
					}
					
					int mod = 10;
					long start = numbersInt[i];
					if(temp1==numbersInt.length){
						temp1 = temp1-1;
					}
					long end = numbersInt[temp1];
					String leftOver = "";
					//System.out.println("===>>>"+start%mod+"  "+end%mod+" "+mod);
					 
					while(start-(start%mod) != end-(end%mod)){
						mod *= 10;
					}  
					 
					i=temp1;
					if((start%mod) == (end%mod)){
						System.out.println("0"+start);
					}else{
						System.out.println("0"+start+"-"+(end%mod));
					}
				}
			}
			System.out.println();
		}
	}

}
