import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static long[] count;
	
	public static void makeCount(int n) {
		count = new long[n+2];
		
		count[1] = 5;
		count[2] = 12;
		
		for(int i=3; i<=n; i++) {
			if(count[i] != 0) {
				continue;
			}
			
			count[i] = count [i-1] + 2 * (i + 1) + i - 1;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		makeCount(n);
		System.out.println(count[n] % 45678);
	}
}
