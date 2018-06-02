package uva.introduction;

import java.io.IOException;
import java.util.Scanner;

public class TEXQuotes272 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		String s;
		boolean open = true;
		boolean close = false;
		while(in.hasNextLine()){
			s = in.nextLine();
			String newStr = "";
			for(int i=0; i<s.length(); i++){
				char c = s.charAt(i);
				
				if(c == '\u001a'){
					break;
				}
				if(s.charAt(i) != '"'){
					newStr += c;
					continue;
				}
				if(s.charAt(i) == '"'){
					if(open){
						newStr += "``";
						open = false;
						close = true;
					}else{
						newStr += "''";
						close = false;
						open = true;
					}
					continue;
				}
			}
			System.out.println(newStr);
		}
	}

}
