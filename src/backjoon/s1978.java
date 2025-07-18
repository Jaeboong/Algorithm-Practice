package backjoon;

import java.io.*;
import java.util.*;

public class s1978 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String args[]) throws Exception {
		int n = Integer.parseInt(br.readLine());
		int max = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
			if (max < arr.get(i)) max = arr.get(i);
			}
		if (max<=1) return;
		
		
		ArrayList<Boolean> primeList = new ArrayList<Boolean>();
		primeList.add(false);
		primeList.add(false);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		for(int i=2; i<=max; i++) primeList.add(i, true);
		
		for(int i=2; (i * i) <= max; i++) {
			if(primeList.get(i)) {
				for(int j=i*i; j<= max; j+=i) primeList.set(j,  false);
			}
		}
		
		for(int i = 0; i < primeList.size(); i++) {
			if(primeList.get(i)) list2.add(i); 
		}
		
		


		
		int result = 0;
		for(int i=0; i< list2.size(); i++) {
			if(arr.contains(list2.get(i))){
				//System.out.println(list2.get(i));
				result++;
			}
		}
		
		System.out.println(result);
		
	}
}
