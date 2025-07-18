package backjoon;

import java.util.*;
import java.io.*;

public class s2805 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Integer.parseInt(st.nextToken());
		long m = Integer.parseInt(st.nextToken());
		List<Integer> arr = new ArrayList<Integer>();
		st = new StringTokenizer(br.readLine());
		
		long max=0;
		
		for(int i=0; i<n; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
			if(max < arr.get(i)) max = arr.get(i);
		}
		long left = 0;
		long right = max;
		long answer = 0;
		while(left <= right) {
			long mid = (left+right)/2;
			long sum = treeSum(arr, mid);
			
			if(sum >= m) {
				answer = mid;
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		
		System.out.println(answer);
	}
	
	
	private static long treeSum(List<Integer> arr, long k) {
		long sum = 0;
		for(int i=0; i<arr.size(); i++) {
			if(arr.get(i)-k<=0) continue;
			else {
				sum += (arr.get(i)- k);
			}
		}
		return sum;
	}
}
