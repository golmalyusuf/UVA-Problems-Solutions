package spoj.basics;

import java.util.Scanner;

public class CharacterPatternsAct5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		CharacterPatternsAct5 cpa5 = new CharacterPatternsAct5();
		
		int t = in.nextInt();
		while(t-- > 0){
			int i = in.nextInt();
			int j = in.nextInt();
			int k = in.nextInt();
			
			cpa5.printCharacterPatterns(i, j, k);
		}
	}
	
	public void printCharacterPatterns(int row, int col, int height){
		
		for(int i = 0; i < row+1+(row*height); i++){
			for(int j = 0; j < col; j++){
				for(int k = 0; k< height; k++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
