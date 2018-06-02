package arrays;

import java.util.Scanner;

public class KadaneAlgorithm {

	public static void main(String[] args) {
		 
		 
		 Scanner in = new Scanner(System.in);
		 int t = in.nextInt();
		 
		 while(t-- > 0){
			 int n = in.nextInt();
			 int arr[] = new int[n];
			 for(int i=0; i<n; i++){
				 arr[i] = in.nextInt();
			 }
			 
			 int kadnane = kadnane(arr, arr.length);
			 System.out.println(kadnane);
		 }
		 
		 
		 System.out.println();
		 
	}
	
	static int kadnane(int arr[], int n) {
		int maxSum = Integer.MIN_VALUE;
		 int maxTillNow = 0;
		 
		 for(int i=0; i<arr.length; i++){
			 maxTillNow = maxTillNow + arr[i];
			  
			 if(maxTillNow > maxSum){
				 maxSum = maxTillNow; 
			 }
			 if(maxTillNow < 0){
				 maxTillNow = 0;
			 }
		 }
		 
		 return maxSum;
	}

}
