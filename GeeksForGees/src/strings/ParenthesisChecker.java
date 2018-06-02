package strings;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int t1 = in.nextInt();
		while( t1-- > 0){  
			String s1 = in.next();
			Queue<Character> ch = new LinkedList<>();
			for(int i=0; i<s1.length(); i++){
				char c= s1.charAt(i);
				if(c == '('||c == '{' || c == '[')
					ch.add(s1.charAt(i));
			}
			int n = ch.size();
			Stack<Character> temp = new Stack<Character>();
			for(int i=0; i<s1.length(); i++){
				char c= s1.charAt(i);
				if(c == ')'||c == '}' || c == ']'){
					temp.push(c); 
				}
			}
			boolean bol = false;
			if(!temp.isEmpty() || temp.size() != ch.size()){
				for(int i=0; i<n; i++){
					 char c = ch.peek();
					 ch.remove();
				 	if(!temp.isEmpty()){
						 char fromTemp = temp.pop();
						 System.out.println("C "+c);
						 System.out.println("Temp V :"+fromTemp);
						 if(c == '(' && fromTemp == ')'|| c == '{' && fromTemp == '}'|| c == '[' && fromTemp == ']'){
							 bol = true;
						 }else{
							 bol = false;
							 temp.push(fromTemp);
							 System.out.println("INSIDE ELSE ");
							 break;
						 }
				 	}else{
				 		bol = false;
				 	}
				}
			}else{
				 bol = false;
		   }
			System.out.println(bol+" balanced"); 
		}
	}

}
