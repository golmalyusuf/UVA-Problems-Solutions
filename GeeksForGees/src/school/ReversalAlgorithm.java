package school;

import java.util.Scanner;

public class ReversalAlgorithm {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		while(t-- > 0){
			int n = in.nextInt();
			int arr[] = new int[n];
			for(int i=0; i<n; i++){
				arr[i] = in.nextInt();
			}
			
			int d = in.nextInt();
			int a[] = rotate(arr, d);
			
			for(int i=0; i<n; i++){
				System.out.println(a[i]+"   ");
			}
		}
	}
	
	public static int[] rotate(int arr[], int d){
		int a[] = new int[arr.length];
		int n = 0;
		for(int i=d; i<arr.length; i++){
			a[n] = arr[i];
			n++;
		}
		
		for(int i=0; i<d; i++){
			a[n] = arr[i];
			n++;
		} 
		return a;
	}

}
