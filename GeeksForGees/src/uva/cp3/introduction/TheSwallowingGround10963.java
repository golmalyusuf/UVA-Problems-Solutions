package uva.cp3.introduction;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TheSwallowingGround10963 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine().trim());
		while(t > 0){
			String str = br.readLine().trim();
			if(!str.isEmpty()){
				//System.out.println("===>>> "+str);
				int n = Integer.parseInt(str);
				int arr[] = new int[n];
				for(int i=0; i < n; i++) {
					String s = br.readLine();
					//System.out.println("     ===>>> "+s);
					if(!s.isEmpty()) {
						String words[] = s.split(" ");
						int a = Integer.parseInt(words[0]);
						int b = Integer.parseInt(words[1]);
						
						arr[i] = Math.abs(a-b);
					}
				}
				
				boolean allsame = true;
				for(int i=0; i<n-1; i++) {
					if(arr[i] != arr[i+1]) {
						allsame = false;
					}
				}
				 
				if(allsame)
					System.out.println("yes");
				else
					System.out.println("no");
				
				System.out.println();
				t--;
			}
		}
	}

}
