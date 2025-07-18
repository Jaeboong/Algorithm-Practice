
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
 * scanner = ���پ� �о���� ������-> �ý������� ��� �ؾ���. 
 * buffered = ���ۿ� ������ �Ŀ� ���ۿ� �ִ°Ÿ� �о���⶧���� �ý������� ����. 
 * 
 * 
 * 
 */