package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PermutationsOfAGivenString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0){
			String str = in.next();
			
			char[] ch = new char[str.length()];
			for(int i=0; i< str.length(); i++) {
				ch[i] = str.charAt(i);
			}
			ArrayList arrList = new ArrayList();
			ArrayList<String> listOfwords = getStrings(str.length(), ch, "", arrList);
			Collections.sort(listOfwords);
			
			for(int i=0; i<listOfwords.size(); i++){
				 System.out.print(listOfwords.get(i)+" ");
			}
			System.out.println();
		}
	}
	
	public static ArrayList<String> getStrings(int length, char ch[], String str, ArrayList arrList){
		
		if(str.length() == ch.length){
			arrList.add(str);
		}else{
			//System.out.println("STR "+str);
			for(int i=0; i<ch.length; i++){
				String temp = str;
				boolean exists = false;
				for(int j=0; j<str.length(); j++){
					if(str.charAt(j) == ch[i]){
						exists = true;
					}
				}
				
				if(exists) continue;
				str += ch[i];
				getStrings(length, ch, str,arrList);
				str = temp;
			}
		}
		return arrList;
	}

}
