package basic;

import java.util.Scanner;

public class TwistedPrimeNumber {
	public static void main(String asdf[]){
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		while(t-->0 ){
			int num = in.nextInt();
			
			TwistedPrimeNumber tp = new TwistedPrimeNumber();
			
			boolean ifPrime = tp.checkIfPrime(num);
			int mirror = 0;
			if(ifPrime){
				mirror = tp.mirrorNumber(num);
				ifPrime = tp.checkIfPrime(mirror);
			}
			if(ifPrime){
				System.out.println("Yes");	
			}else{
				System.out.println("No");
			}
			
		}
	}
	
	public int mirrorNumber(int num){
		
		int a = num;
		int sum = 0;
		while(a > 0){
			int i = a%10;
			a = a/10;
			sum *= 10;
			sum += i; 
		}
		return sum;
	}
	
	public boolean checkIfPrime(int num){
		boolean result = false;
		
		int m = num/2;
		int flag = 0;
		
		for(int i = 2; i<=m ;i++){
			if(num%i == 0){
				flag++;
				break;
			}
		}
		
		if(flag == 0){
			result = true;
		}
		return result;
	}
}
