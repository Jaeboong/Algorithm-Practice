
package backjoon;
import java.util.*;
import java.io.*;

public class s2562
{
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String args[]) throws Exception
	{
		int[] arr = new int[9];
		int max = 0;
		int index = 0;
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(max < arr[i]) {
				max = arr[i];
				index = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	}
}