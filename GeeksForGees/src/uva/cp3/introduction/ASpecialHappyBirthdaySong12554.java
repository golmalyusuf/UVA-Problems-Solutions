package uva.cp3.introduction;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ASpecialHappyBirthdaySong12554 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 
		 int n = in.nextInt();
		 String arr[] = new String[n];
		 for(int i = 0; i < n; i++) {
			 arr[i] = in.next();
		 }
		 
		 String song = "Happy birthday to you Happy birthday to you Happy birthday to Rujia Happy birthday to you";
		 
		 String words[] = song.split(" ");
		 String arrStr[] = new String[words.length];
		 
		 for(int i=0; i<words.length; i++) {
			 arrStr[i]  = words[i];
		 }
		 
		 int loop = 0;
		 
		 if(n <= 16) {
			 loop = 1;
		 } else if(n <= 32) {
			 loop = 2;
		 } else if(n <= 48) {
			 loop = 3;
		 } else if(n <= 64) {
			 loop = 4;
		 } else if(n <= 80) {
			 loop = 5;
		 } else if(n <= 96) {
			 loop = 6;
		 } 
		 
		 for(int i=0, j=0, k=0; i<loop*16; i++) {
			 System.out.println(arr[j] +": "+arrStr[k]);
			 j++; k++;
			 if(k == 16) {
				 k = 0;
			 }
			 if(j == n) {
				j = 0; 
			 }
		 }
		 
		  
	}

}
