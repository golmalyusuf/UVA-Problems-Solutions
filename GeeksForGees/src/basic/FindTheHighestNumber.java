package basic;

import java.util.Scanner;

public class FindTheHighestNumber {

	public static void main(String asfd[]){
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		while(t-- > 0){
			int i = in.nextInt();
			int arr[] = new int[i];
			
			int max = 0;
			for(int j = 0; j < arr.length; j++){
			    int m = in.nextInt();
				arr[j] = m;
				if(m > max){
				    max = m;
				}
			}
			//int a = Arrays.stream(arr).max().getAsInt();
			System.out.println(max);
		}
	}
}
