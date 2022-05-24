import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int f = sc.nextInt();
		int num = Integer.parseInt(n.substring(0, n.length() - 2) + "0".repeat(2));
		int answer = 0;
		
		while(true) {
			if(num % f == 0) {
				answer = num;
				break;
			}
			
			num++;
		}
		
		System.out.println(String.format("%d%d", answer/10 % 10, answer % 10));
	}
}
