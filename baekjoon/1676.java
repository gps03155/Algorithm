import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger n = new BigInteger(br.readLine());
		
		int test = 1;
		BigInteger factorial = BigInteger.ONE;
		while(test <= n.intValue()) {
			factorial = factorial.multiply(BigInteger.valueOf(test));
			test++;
		}
		
		String str = factorial.toString();
		int count = 0;
		
		for(int i=str.length() - 1; i>=0; i--) {
			if(str.charAt(i) != '0') {
				System.out.println(count);
				return;
			}
			count++;
		}
	}
}
