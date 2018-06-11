package uva.cp3.introduction;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class GreedyGiftGiver119 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int counter=0;
		while(sc.hasNext())
		{
			int n=sc.nextInt();
			HashMap<String, Integer> map=new HashMap<>();
			String [] names=new String[n];
			for(int i=0;i<n;i++)
			{
				String s=sc.next();
				names[i]=s;
				map.put(s, 0);
			}
			for(int p=0;p<n;p++)
			{
				String giver=sc.next();
				int money=sc.nextInt();
				int getters=sc.nextInt();
				if(getters==0)
				{
					continue;
				}
				int perPerson=money/getters;
				map.put(giver,map.get(giver)-(perPerson*getters));
				for(int i=0;i<getters;i++)
				{
					String per=sc.next();
					map.put(per, map.get(per)+perPerson);
				}
			}
			if(counter>0)
                               System.out.println();
                        counter++;
			for(int i=0;i<n;i++)
			{
				System.out.println(names[i]+" "+map.get(names[i]));
			}
 
		}
		sc.close();

	}

}
