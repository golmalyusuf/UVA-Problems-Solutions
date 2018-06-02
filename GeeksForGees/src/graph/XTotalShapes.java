package graph;

import java.io.PrintWriter;
import java.util.Scanner;

public class XTotalShapes {
	public static void main(String asf[]) {
		Scanner in = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int t = in.nextInt();
		while(t-- > 0){
			int n = in.nextInt();
			int m = in.nextInt();
			
			char arr[][] = new char[n][m];
			boolean visited[][] = new boolean[n][m]; 
			for (int i = 0; i < n; i++) {
				//System.out.println(i);
				arr[i] = in.next().toCharArray();
			}
			int count=0;
			for(int i=0; i<n; i++){
				for(int j=0; j<m; j++){
					if(arr[i][j] == 'X' && !visited[i][j]){
						visited[i][j]= true;
						System.out.println("Line 27 " + i + "  " + j + " ");
						dfs(arr, i, j, n, m, visited);
						count++;
					}
				}
			}
			System.out.println(count);
		}  
	}
	
	public static boolean inRange(int i, int j, int n, int m){
		if(i>=0 && i < n && j>=0 && j<m){
			return true;
		}
		return false;
	}
	
	static void dfs(char[][] arr, int i, int j, int n, int m, boolean[][] visited){
	 	if(inRange(i-1, j, n, m) && arr[i-1][j]=='X' && !visited[i-1][j]){
			visited[i-1][j] = true;
			System.out.println("    Line 46 i-1, j "+ (i-1) + "  " + j );
			dfs(arr, i-1, j, n, m, visited);
		}
		
		if(inRange(i, j-1, n, m) && arr[i][j-1]=='X' && !visited[i][j-1]){
			visited[i][j-1] = true;
			System.out.println("    Line 52 i, j-1 "+ (i) + "  " + (j-1));
			dfs(arr, i, j-1, n, m, visited);
		}
		
		if(inRange(i+1, j, n, m) && arr[i+1][j]=='X' && !visited[i+1][j]){
			visited[i+1][j] = true;
			System.out.println("    Line 58 i+1, j "+ (i+1) + "  " + j );
			dfs(arr, i+1, j, n, m, visited);
		} 
		
		if(inRange(i, j+1, n, m) && arr[i][j+1]=='X' && !visited[i][j+1]){
			visited[i][j+1] = true;
			System.out.println("    Line 64 i, j+1 "+ (i) + "  " + (j+1) );
			dfs(arr, i, j+1, n, m, visited);
		}
	}
}