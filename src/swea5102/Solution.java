
package swea5102;
import java.util.*;
import java.io.*;

public class Solution
{
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String args[]) throws Exception
	{
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int sum = 0;
			for(int i = 0; i < n; i++) {
				char e = st.nextToken().charAt(0);
				sum += e;
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