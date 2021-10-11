import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static int[] fibo = new int[21];
	
	public static int fibo(int n) {
		if(n == 0) {
			return 0;
		}
		else if(n <= 2) {
			return 1;
		}
		else {
			if(fibo[n] == 0) {
				fibo[n] = fibo(n-1) + fibo(n-2);
			}
			
			return fibo[n];
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		System.out.println(fibo(n));
	}
}
