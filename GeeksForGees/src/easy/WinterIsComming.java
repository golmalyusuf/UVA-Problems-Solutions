package easy;

import java.util.Scanner;

public class WinterIsComming {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		WinterIsComming wic = new WinterIsComming();
		while(t!=0){
			int i = in.nextInt();
			int j = in.nextInt();
			int arr[] = new int[i];
			
			for(int k = 0; k<arr.length; k++){
				arr[k] = in.nextInt();
			}
			System.out.println(wic.isPrime(arr, j));
			if(wic.isPrime(arr, j)){
			    System.out.println(1);
			}else{
			    System.out.println(0);
			}
			t--;
		}
	}
	
	public boolean isPrime(int arr[], int j){
		boolean ifPrime = false;
		int flag = 0;
		
		for(int i=0; i<j; i++){
			if(i==j-1){
				int m = arr[i]/2;
				 System.out.println("i "+i+" arr=="+arr[i]+"m"+m);
				for(int k= 2; k<=m; k++){
					if(arr[i]%k == 0){
						flag = 1;
						System.out.println("Flag 1 "+flag);
						System.out.println(arr[i]+" == "+k);
						break;
					}
				}
			 System.out.println("flag 2 "+flag);
				if(flag == 0){
					ifPrime = true;
				}
			}
		}
		 System.out.println("if Prime "+ifPrime);
		
		return ifPrime;
	}
}
