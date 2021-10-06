import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static int[] fibo = new int[41];
	public static int[] zeroCount = new int[41];
	public static int[] oneCount = new int[41];
	
	public static int fibonacci(int n) {
		if(n == 0) {
			zeroCount[n] = 1;
			return 0;
		}
		else if(n == 1) {
			oneCount[n] = 1;
			return 1;
		}	
		else {
			if(fibo[n] > 0) {
				return fibo[n];
			}
			else {
				fibo[n] = fibonacci(n-1) + fibonacci(n-2);
				zeroCount[n] = zeroCount[n-1] + zeroCount[n-2];
				oneCount[n] = oneCount[n-1] + oneCount[n-2];
				return fibo[n];
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Long test = Long.parseLong(br.readLine());
		
		fibo[0] = 0;
		fibo[1] = 1;
		
		for(int i=0; i<test; i++) {
			int num = Integer.parseInt(br.readLine());
			
			fibonacci(num);
			
			System.out.println(zeroCount[num] + " " + oneCount[num]);
		}
	}
}
