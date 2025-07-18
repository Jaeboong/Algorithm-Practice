
package backjoon;
import java.util.*;
import java.io.*;

public class s11720
{
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String args[]) throws Exception
	{
			int n = Integer.parseInt(br.readLine());
			String s = br.readLine();
			
			int sum = 0;
			for(int i = 0; i < n; i++) {
				sum += s.charAt(i) - '0';
			}
			
			System.out.println(sum);
	}
		
		
}

/**
 * scanner = 한줄씩 읽어오기 떄문에-> 시스템콜을 계속 해야함. 
 * buffered = 버퍼에 저장한 후에 버퍼에 있는거를 읽어오기때문에 시스템콜이 적음. 
 * 
 * 
 * 
 */