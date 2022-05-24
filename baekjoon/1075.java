import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f = sc.nextInt();
		int num = n / 100 * 100;
		
		while(num % f != 0) {
			num++;
		}
		
		System.out.printf("%02d", num % 100);
	}
}
