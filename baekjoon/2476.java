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
		int test = Integer.parseInt(br.readLine());
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<test;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int price = 0;
			
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			int third = Integer.parseInt(st.nextToken());
			
			if(first == second && first == third && second == third) {
				price = 10000 + first * 1000;
			}
			else if(first == second || first == third) {
				price = 1000 + first * 100;
			}
			else if(second == third) {
				price = 1000 + second * 100;
			}
			else {
				int temp = Math.max(first, Math.max(second, third));
				price = temp * 100;
			}
			
			max = Math.max(price, max);
		}
		
		System.out.println(max);
	}
}
