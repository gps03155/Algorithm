import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		List<BigInteger> list = new ArrayList<>();
		
		for(int i=0; i<test; i++) {
			BigInteger file = sc.nextBigInteger();
			
			if(file.compareTo(BigInteger.ZERO) > 0) {
				list.add(file);
			}
		}
		
		BigInteger cluster = sc.nextBigInteger();
		BigInteger total = BigInteger.ZERO;
		
		for(BigInteger file : list) {
			if(cluster.subtract(file).compareTo(BigInteger.ZERO) < 0) {
				total = total.add(file.divide(cluster).multiply(cluster));
				
				if(file.mod(cluster).compareTo(BigInteger.ZERO) > 0) {
					total = total.add(cluster);
				}
			}
			else {
				total = total.add(cluster);
			}
		}
		
		System.out.println(total);
	}
}

