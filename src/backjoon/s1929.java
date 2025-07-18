package backjoon;

import java.io.*;
import java.util.*;

public class s1929{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String args[]) throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int min = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());

		if (max<=1) return;
		
		
		ArrayList<Boolean> primeList = new ArrayList<Boolean>();
		primeList.add(false);
		primeList.add(false);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		for(int i=2; i<=max; i++) primeList.add(i, true);
		//System.out.println(primeList);
		
		for(int i=2; (i * i) <= max; i++) {
			if(primeList.get(i)) {
				for(int j=i*i; j<= max; j+=i) primeList.set(j,  false);
			}
		}
		
		for(int i = 0; i < primeList.size(); i++) {
			if(primeList.get(i) && i >= min) list2.add(i); 
		}
		
		for(int a : list2) {
			System.out.println(a);
		}
		
		
	}
}
