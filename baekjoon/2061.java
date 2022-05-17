import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		BigInteger k = sc.nextBigInteger();
		int l = sc.nextInt();
		
		for(int i=2; i<l; i++) {
			while(k.mod(BigInteger.valueOf(i)).compareTo(BigInteger.ZERO) == 0) {
				k = k.divide(BigInteger.valueOf(i));
				
				if(i < l || k.compareTo(BigInteger.valueOf(l)) < 0) {
					System.out.println("BAD " + k.min(BigInteger.valueOf(i)));
					return;
				}
			}
		}
		
		System.out.println("GOOD");
	}
}
