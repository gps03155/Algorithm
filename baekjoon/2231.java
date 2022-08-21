/** 
* 브루트포스 
* 모든 경우의 수 계산
**/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		for(int i=1; i<=n; i++) {
			int sum = i;
			int num = i;
			
			while(num > 0) {
				sum += num % 10;
				num /= 10;
			}
			
			if(sum == n) {
				System.out.println(i);
				return;
			}
		}
		
		System.out.println(0);
	}
}
