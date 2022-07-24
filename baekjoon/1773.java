import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int student = sc.nextInt();
		int endTime = sc.nextInt();

		int[] answer = new int[2000001];
		int count = 0;
		
		for(int i=0; i<student; i++) {
			int period = sc.nextInt();
			
			for(int j=0; j<=endTime; j+=period) {
				if(j > 0 && answer[j] == 0) {
					answer[j] = j;
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}
