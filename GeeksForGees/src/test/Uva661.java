package test;

import java.util.Scanner;

public class Uva661 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,m,c;
	    int testCase = 1;
	    while( true){
	    	n = in.nextInt(); 
	        m = in.nextInt(); 
	        c = in.nextInt();
	        
	        if(n==0 && m==0 && c==0) { break;} 
	        System.out.println("C M C"+n+"  "+m +"  "+c);
	    boolean state[] = new boolean[n+1];
	    int consumption[] = new int[n+1];
	    for(int i=1;i<=n;i++)state[i] = false;
	    for(int i=1;i<=n;i++) consumption[i] = in.nextInt();
	    int max = 0;
	    int runningPower = 0;
	    for(int i=1;i<=m;i++){
	     int temp; 
	     temp = in.nextInt();
	     if(state[temp]==false){
	      state[temp] = true;
	      runningPower += consumption[temp];
	      System.out.println(temp+"---------->>"+consumption[temp]+"   "+runningPower);
	      if(runningPower > max )max = runningPower;
	     }
	     else if(state[temp]==true){
	      state[temp] = false;
	      runningPower -= consumption[temp];
	     }
	      
	    }
	    System.out.println("Sequence "+testCase++);
	    if(max > c)System.out.print("Fuse was blown.\n\n");
	    else {
	    	System.out.print("Fuse was not blown.\n");
	    	System.out.print("Maximal power consumption was "+max+" amperes.\n\n");
	    }
	    }

	}

}
