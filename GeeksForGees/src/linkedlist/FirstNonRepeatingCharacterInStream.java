package linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class FirstNonRepeatingCharacterInStream {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine().toString());
		LinkedList<Character> lList = new LinkedList<Character>();
		
		while(t-->0){
			int n = Integer.parseInt(br.readLine().toString());
			
			String str = br.readLine().toString();
			if(str.length() == (n*2)-1){
				
				for(int i=0; i<str.length(); ){
					char s = str.charAt(i);
					i+=2;
					lList.add(s);
					System.out.println(lList.size()+"==>"+lList.contains(s));
					if(lList.contains(s)){
						System.out.print("-1");
					}else{
						System.out.print(s);
					}
				}
			}
		}
	}

}
