package backjoon;

import java.util.*;
import java.io.*;

public class s1654 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		List<Integer> arr = new ArrayList<Integer>();
		
		long total = 0;
		for (int i=0; i<K; i++) {
			arr.add(Integer.parseInt(br.readLine()));
			total += arr.get(i);
		}
//		System.out.println("total "+ total);
		long low = 0;
		long high = total / N + 1;
//		System.out.println("high " + high);
		long answer = 0;
		long mid = 0;
		
//		if(high==1) {
//			if(total >= N) System.out.println(1);
//		}
//		else {
		while(low<high) {
			mid = (low + high) / 2;
//			System.out.println(low + " " + mid + " " + high);
			if(isN(arr, N, mid)) {
				answer = mid;
				low = mid+1;
			}
			else high = mid-1;
		}
		
		System.out.println(answer);
		}
	
	private static boolean isN (List<Integer> arr, int N, long mid) {
		int count = 0;
		for(int i=0; i<arr.size(); i++) {
			if(mid > 0) count += (arr.get(i) / mid);
		}
		if(count >= N) {
//			System.out.println("true " + count);
			return true;}
		else {
//			System.out.println("false " + count);
			return false;
		}
	}

}
