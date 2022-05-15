import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BigInteger p = sc.nextBigInteger();
		Integer k = sc.nextInt();
		
		boolean[] primes = new boolean[k+1];
		
		for(int i=2; i<k; i++) {
			if(primes[i]) continue;
			
			BigInteger num = new BigInteger(String.valueOf(i));
			
			if(p.mod(num).compareTo(BigInteger.ZERO) == 0) {
				System.out.println("BAD " + num);
				return;
			}
			
			for(int j=i+i; j<=k; j+=i) {
				primes[j] = true;
			}
		}
		
		System.out.println("GOOD");
	}
}
