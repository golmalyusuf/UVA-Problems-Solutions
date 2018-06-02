package uva.cp3.introduction;

import java.util.Arrays;
import java.util.Scanner;

public class Parking11364 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while(t-- > 0){
			int n = in.nextInt();
			int arr[] = new int[n];
			
			for(int i=0; i<n; i++){
				arr[i] = in.nextInt();
			}
			
			int min = 0; 
			int max = 0;
			Arrays.sort(arr);
			min = arr[0];
			max = arr[n-1];
			
			int out = (max-min)*2;
			System.out.println(out);
		}
	}
}
