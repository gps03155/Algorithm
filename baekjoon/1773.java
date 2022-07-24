import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int student = sc.nextInt();
		int endTime = sc.nextInt();

		boolean[] answer = new boolean[endTime + 1];
		int count = 0;
		
		for(int i=0; i<student; i++) {
			int period = sc.nextInt();
			
			for(int j=period; j<=endTime; j+=period) {
				if(!answer[j]) {
					answer[j] = true;
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}
