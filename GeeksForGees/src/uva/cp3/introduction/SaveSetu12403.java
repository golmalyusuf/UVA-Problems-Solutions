package uva.cp3.introduction;

import java.util.Scanner;

public class SaveSetu12403 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int count = 0;
		while(in.hasNext()){
			String s = in.nextLine();
			
			if(s.contains("donate")){
				String words[] = s.split(" ");
				
				int amount = 0;
				if(words.length > 1 && words[1] != null){
					amount = Integer.parseInt(words[1]);
					count+= amount;
				}
			}
			
			if(s.contains("report")){
				System.out.println(count);
			}
			t--;
			if(t == -1){
				break;
			}
			
		}
	}
}
