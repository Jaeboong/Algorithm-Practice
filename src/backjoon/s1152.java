package backjoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class s1152 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String args[]) throws Exception {
		String str = br.readLine().trim();
		if(str.isEmpty()) {
			System.out.println(0);
		}
		else {
			String[] arr = str.split("\\s+");
			System.out.println(arr.length);
		}
	}
}
