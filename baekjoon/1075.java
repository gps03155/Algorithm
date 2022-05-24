import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int f = sc.nextInt();
		int num = Integer.parseInt(n.substring(0, n.length() - 2) + "0".repeat(2));
		
		while(num % f != 0) {
			num++;
		}
		
		System.out.printf("%02d", num % 100);
	}
}
