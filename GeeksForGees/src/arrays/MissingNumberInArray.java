package arrays;

import java.util.Scanner;

public class MissingNumberInArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		while(t-- > 0) {
			int n = in.nextInt();
			int arr[] =	setArray(n, in);
			System.out.println(missingNumber(arr, n));
		}
	}
	
	static int[] setArray(int n, Scanner in){
		int arr[] = new int[n-1];
		for(int i = 0; i<n-1; i++){
			arr[i] = in.nextInt();
		} 
		return arr;
	}
	static int missingNumber(int arr[], int n) { 
		int num = (n*(n+1))/2;
		for(int i=0; i<arr.length; i++){
			num -= arr[i]; 
		}
		return num;  
	}
}
