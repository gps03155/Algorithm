import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int pass = 0, score = 0;
		
		for(int i=0; i<test; i++) {
			int num = sc.nextInt();
			
			if(num == 1) {
				pass++;
				score += pass;
			}
			else {
				pass = 0;
			}
		}
		
		System.out.println(score);
	}
}
