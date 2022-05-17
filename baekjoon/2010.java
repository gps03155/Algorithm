import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			int plug = Integer.parseInt(br.readLine());
			
			if(i == n-1) sum += plug;
			else sum += plug - 1;
		}
		
		System.out.println(sum);
	}
}
