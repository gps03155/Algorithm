import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<3; i++) {
			String[] arr = br.readLine().split(" ");
			
			long zeroCount = Arrays.asList(arr).stream().filter(m -> "0".equals(m)).count();
			long oneCount = Arrays.asList(arr).stream().filter(m -> "1".equals(m)).count();
			
			if(zeroCount == 1 && oneCount == 3) {
				System.out.println("A");
			}
			else if(zeroCount == 2 && oneCount == 2) {
				System.out.println("B");
			}
			else if(zeroCount == 3 && oneCount == 1) {
				System.out.println("C");
			}
			else if(zeroCount == 4) {
				System.out.println("D");
			}
			else if(oneCount == 4) {
				System.out.println("E");
			}
		}
	}
}
