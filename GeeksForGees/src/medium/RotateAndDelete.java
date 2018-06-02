package medium;

import java.util.Scanner;

public class RotateAndDelete {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		while(t-- > 0){
			int n = in.nextInt();
			int arr[] = new int[n]; 
			
			for(int i=0; i<n; i++){
				arr[i] = in.nextInt();
			}
			
			for(int i=0; i<n; i++){
				System.out.print(arr[i] +" ");
			}
			
			int k = n;
			for(int i=0; i<k; i++){
					int temp = arr[i];
					arr[i] = arr[k-1];
					arr[k-1] = temp;
			}
			
			for(int i=0; i<n; i++){
				System.out.print(arr[i] +" ");
			}
		}
	}

}
