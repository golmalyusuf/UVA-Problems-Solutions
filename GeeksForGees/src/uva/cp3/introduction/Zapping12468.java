package uva.cp3.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zapping12468 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		while(true) {
			String s = br.readLine().toString();
			String words[] = s.split(" ");
			int a = Integer.parseInt(words[0]);
			int b = Integer.parseInt(words[1]);
			
			if(a == -1 && b == -1) {
				break;
			}
			int change = 0;

			change = Math.min(Math.abs(b-a), 100-Math.abs(b-a));
			System.out.println(change);
		}
	}

}
