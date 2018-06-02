package uva.cp3.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RobotInstructions12503 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine().toString());
		while(t-- > 0) {
			int instruction = Integer.parseInt(br.readLine().toString());
			String strArray[] = new String[instruction];
			//int getval[] = new int[instruction];
			String setpos[] = new String[instruction];
			int p = 0;
			for(int i=0; i<instruction; i++) {
				strArray[i] = br.readLine().toString();
				String cmd = strArray[i];
				 
				if(cmd.trim().equals("LEFT")) {
					p = p-1;
					setpos[i] = "LEFT";
				} else if(cmd.trim().equals("RIGHT")) {
					p = p+1;
					setpos[i] = "RIGHT";
				} else if(cmd.contains("SAME")) {
					String words[] = cmd.split(" ");
					int j = Integer.parseInt(words[2]);
					j-=1;
					 
					if(setpos[j].equals("LEFT")) {
						p = p -1;
						setpos[i] = "LEFT";
					}else if(setpos[j].equals("RIGHT")) {
						p = p+1;
						setpos[i] = "RIGHT"; 
					}
				} 
			}
			System.out.println(p);
		}
	}
}
