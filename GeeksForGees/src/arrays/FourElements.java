package arrays;

import java.util.Scanner;

public class FourElements {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		while(t-- > 0){
			int n = in.nextInt();
			int arr[] = new int[n];
			
			for(int i=0; i<n; i++){
				arr[i] = in.nextInt();
			}
			
			int x = in.nextInt();
			
			System.out.println("GET VAL ==> "+getElement(arr, x));
		}
	}
	
	static int getElement(int arr[], int x){
		
		int val = 0;
		for(int i=0; i<arr.length; i++){
			int count= 1;
			int add = 0;
			System.out.println("i is "+i);
			for(int j=i; j<arr.length; j++ ){
				if(add+arr[j] <= x && count <= 4){
					add += arr[j];
					count++;
					if( j < arr.length-1 && add+arr[j+1] > x){
						add -= arr[j];
						count--;
					}
				}
				System.out.println("  j is "+j +"  add is "+add);
				
				if(add == x){
					val = 1;
				}
			}
			if(val == 1){
				break;
			}
		}
		return val;
	}

}
