package backjoon;


import java.util.*;
import java.io.*;

public class s1920 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> arr1 = new ArrayList<Integer>();
		for(int i = 0; i<N; i++) {
			arr1.add(Integer.parseInt(st.nextToken()));
		}
		
		
		int M = Integer.parseInt(br.readLine());
		List<Integer> arr2 = new ArrayList<Integer>();
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<M; i++) {
			arr2.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(arr1);
		
		for(int i=0; i<M; i++) {
			System.out.println(binarySearch(arr1, 0, arr1.size()-1, arr2.get(i)));
		}
	}
	
	public static int binarySearch(List<Integer> arr, int low, int high, int key) {
		while(low <= high) {
			int mid = low+(high-low)/2;
			
			if(arr.get(mid)==key) return 1;
			else if (arr.get(mid) > key) high = mid - 1;
			else low = mid+1;
		}
		
		return 0;
	}
}
