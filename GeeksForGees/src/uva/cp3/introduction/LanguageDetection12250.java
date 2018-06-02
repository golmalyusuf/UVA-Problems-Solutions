package uva.cp3.introduction;

import java.util.HashMap;
import java.util.Scanner;

public class LanguageDetection12250 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		while(in.hasNextLine()){
			String s = in.nextLine();
			if(s.equals("#")){
				break;
			}
			
			HashMap<String, String> map = new HashMap<String, String>();
			
			map.put("HELLO", "ENGLISH");
			map.put("HOLA", "SPANISH");
			map.put("HALLO", "GERMAN");
			map.put("BONJOUR", "FRENCH");
			map.put("CIAO", "ITALIAN");
			map.put("ZDRAVSTVUJTE", "RUSSIAN");
			
			if(map.containsKey(s)){
				System.out.println("Case "+(++count)+": "+map.get(s));
			}else{
				System.out.println("Case "+(++count)+": "+"UNKNOWN");
			}
		}
	}
}
