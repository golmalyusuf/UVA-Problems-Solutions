package arrays;

import java.util.Scanner;

public class ArrayOfAlternate {
	public static void main(String adf[]){
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		while(t-- > 0){
			int n = in.nextInt();
			int arr[] = new int[n];
			for(int i=0; i<n; i++){
				arr[i] = in.nextInt();
			}
			
			rearrange(arr, n);
		}
	}
	
	static void rearrange(int arr[], int n){
		int i = -1;
		int temp = 0;
		
		for(int j=0; j<n; j++){
			if(arr[j] < 0){
				i++;
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		
		int pos = i+1; 
		int neg = 0;
	 
		for (int k = pos; k < n-1; k++){
			for (int j = pos; j < n-k-1; j++)
				if (arr[j] > arr[j+1])
				{
					int temp2 = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp2;
				}
		}
		
		for(int j=0; j<n; j++)
			System.out.print(arr[j]+" ");
		
		System.out.println();
		while( pos < n && pos > neg && arr[neg] < 0){
			temp = arr[neg];
			arr[neg] = arr[pos];
			arr[pos] = temp;
			pos++;
			neg+=2;
		}
		
		for(int j=0; j<n; j++)
		System.out.print(arr[j]+" ");
	}
}
