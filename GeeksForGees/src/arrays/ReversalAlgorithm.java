package arrays;

import java.util.Scanner;

public class ReversalAlgorithm {
	public static void main(String af[]){
		Scanner in = new Scanner(System.in);
		 
		int t = in.nextInt();
		while( t-- > 0){
			 
			int n = in.nextInt(); 
			int arr[] = new int[n];
			
			for(int i = 0; i < n; i++){
				arr[i] = in.nextInt();
			}
		 
			int d = in.nextInt();
			if(d<=n)
				reverse(arr, d, n);
		}
	}
	
	static void reverse(int arr[], int d, int n){
		int temp[] = new int[n];
		
		int j = d;
		 for(int i = 0; i < n; i++){
			 temp[i] = arr[i];
			 if(j<n){
				 arr[i] = arr[j++];
			 }
		 }
		 j = n - d;
		 int count =0;
		  for(int i = j; i < n; i++){
			 arr[i] = temp[count++];
		 }  
		 
		 for(int i = 0; i < n; i++){
			 System.out.println(arr[i]);
		 }
	}
}
