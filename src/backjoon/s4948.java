package backjoon;

import java.util.*;
import java.io.*;

public class s4948 {

	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//ют╥б
		List<Integer> num = new ArrayList<Integer>();
		List<Integer> result = new ArrayList<Integer>();
		while(true) {
			int input = Integer.parseInt(br.readLine());
			if(input == 0) break;
			
			num.add(input);
		}
		//System.out.println(num);
		//
		for (int i=0; i<num.size(); i++) {
			int min = num.get(i);
			int max = min * 2;
			//System.out.println(max);
				
			List<Boolean> primeList = new ArrayList<Boolean>();
			primeList.add(false);
			primeList.add(false);
			for(int x=2; x<=max; x++) primeList.add(true);
			
			
			for(int x=2; (x*x)<=max; x++) {
				if(primeList.get(x)) {
					for(int y=x*x; y<=max; y+=x) 
						primeList.set(y, false);
					}
				}
			//System.out.println(primeList);
			int count = 0;
			for(int j=min+1; j<=max; j++) {
				if(primeList.get(j))
					count++;
			}
			result.add(count);
		}	
		for(int j=0; j<result.size(); j++)
			System.out.println(result.get(j));
	}
}
