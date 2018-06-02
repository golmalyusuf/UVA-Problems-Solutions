package arrays;

import java.util.Scanner;

public class RotateAndDelete {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		
		while(testcases > 0){
			int n = in.nextInt();
			int arr[] = new int[n];
			int count=1;
			for(int i = 0; i<arr.length; i++){
				arr[i] = in.nextInt();
			}
			
			for(int i = 0; i<arr.length; i++){
				int[] temp = rotate(n, arr, count++);
			}
			testcases--;
		}
	}
	
	public static int[] rotate(int n, int arr[], int count){
		int temp[] = new int[n-count];
		int a = arr[0];

		for(int i=0; i<temp.length; i++){
			temp[i] = arr[i+1];
		}

		//temp[n-1] = a;
		return temp;
	}

}
