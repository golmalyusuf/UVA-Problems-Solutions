package arrays;

import java.util.Scanner;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		int sum = 12;
		 
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while(t-- > 0){
			int n = in.nextInt();
			int m = in.nextInt();
			int arr[] = new int[n];
			
			for(int i=0; i<n; i++){
				arr[i] = in.nextInt();
			} 
			FindSubArray(arr, m); 
		} 
	}
	
	static void FindSubArray(int arr[], int sum){
		int n = arr.length;
		int curr = 0;
		boolean found = false;
		for(int i=0; i<n; i++) {
			curr = arr[i];
			
			for(int j=i+1; j<n; j++) {
				if(curr > sum || j >= n){
					curr = 0;
					break; 
				}
				
				curr += arr[j];
				if(curr == sum){
					System.out.println((i+1)+" "+(j+1));
					found = true;
				}
			}
			if(found){
				break;
			}
		}
	} 
}
