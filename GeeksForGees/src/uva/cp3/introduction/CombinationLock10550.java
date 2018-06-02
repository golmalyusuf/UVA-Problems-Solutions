package uva.cp3.introduction;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CombinationLock10550 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s;
		while(in.hasNext()){
			s = in.nextLine();
			StringTokenizer st = new StringTokenizer(s);
			
			int i = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(i == 0 && a == 0 && b == 0 && c == 0){
				break;
			}
			
			int deg = 1080;
			int temp = i-a;
			if(temp < 0){
				temp = 40 + temp;
			}
			//System.out.println("a is "+temp*9);
			deg += temp*9;
			
			temp = b - a;
			if(temp < 0){
				temp = 40 + temp;
			}
			//System.out.println("b is "+temp*9);
			deg += temp * 9;
			temp = b - c;
			if(temp < 0){
				temp = 40 + temp;
			}
			//System.out.println("c is "+temp*9);
			deg += temp * 9;
			
			System.out.print(deg+"\n");
		}
		System.out.println();
	}

}

/* 
2 15 28 34 
25 18 1 0
19 19 19 19
33 3 36 39
39 11 22 5
2 37 18 17
0 0 0 0
1746
1359
1080
1980
1584
1323*/