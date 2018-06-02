package uva.beginingAlgoContest1;

import java.util.Scanner;

class HashmatTheBraveWarrior10055 { 
	public static void main(String[] args)   {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			long i = in.nextLong();
			long j = in.nextLong();
			if(i>j){
				System.out.println((i-j));
			}else {
				System.out.println(j-i);
			}
		}
	 }
}
