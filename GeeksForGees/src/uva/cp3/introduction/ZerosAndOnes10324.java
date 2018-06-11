package uva.cp3.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZerosAndOnes10324 {

	public static void main(String[] args) throws IOException {
		//Scanner in = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		String s = "";
		while ((s = br.readLine())!= null){
			//String s = in.next();
			
			int t = Integer.parseInt(br.readLine().trim());//in.nextInt();
			System.out.println("Case "+ ++count+":");
			for(int i=0; i<t; i++) {
				String str = br.readLine();
				String words[] = str.split(" ");
				int a = Integer.parseInt(words[0].trim());//in.nextInt();
				int b = Integer.parseInt(words[1].trim());//in.nextInt();
				String subStr = "";
				 
				if(a < b) {
					 if(b+1 <= s.length())
						b+=1; 
					subStr = s.substring(a, b);
				}else if (a > b){
					 if(a+1 <= s.length())
						a+=1; 
					subStr = s.substring(b, a);
				} else if(a == b) {
					subStr = ""+s.charAt(a);
				}
				 
				char c = subStr.charAt(0);
				boolean same = true;
				for(int j=0; j<subStr.length() ; j++) {
					if(c != subStr.charAt(j)) {
						same = false;
						break;
					}
				}
				
				if(same)
					System.out.println("Yes");
				else 
					System.out.println("No");
			}
		}
	}

}
