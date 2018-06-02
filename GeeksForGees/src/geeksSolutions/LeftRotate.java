package geeksSolutions;
/*
 * Reverse an array with specific number of rotation. 
 * 123456
 * 2
 * 345612
 * */
import java.util.Scanner;

public class LeftRotate {
	public static void main(String adf[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = in.nextInt();
		}
		
		int d = in.nextInt();
		
		leftrotate(arr, d);
		display(arr);
	}
	
	public static void display(int arr[]){
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]+" ");
		}
	}
	
	public static void leftrotate(int arr[], int d){
		int n = arr.length;
		
		rvereseArray(arr, 0, d-1);
		rvereseArray(arr, d, n-1);
		rvereseArray(arr, 0, n-1);
	}
	
	public static void rvereseArray(int arr[], int start, int end){
		int temp;
		
		while(start < end){
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
