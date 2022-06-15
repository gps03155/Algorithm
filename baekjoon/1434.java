import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] boxs = new int[n];
		int[] books = new int[m];

		for (int i = 0; i < n; i++) {
			boxs[i] = sc.nextInt();
		}

		for (int i = 0; i < m; i++) {
			books[i] = sc.nextInt();
		}

		int[] weights = new int[n];
		int answer = 0;
		int bookIndex = 0;
		
		for (int i = 0; i < n; i++) {
			while(bookIndex < m) {
				int weight = weights[i] + books[bookIndex];
				
				if(weight > boxs[i]) break;

				weights[i] += books[bookIndex];
				bookIndex++;
			}
			
			// box가 다 찬 경우 낭비된 용량 계산 (다음 박스로 넘어가기 전)
			answer += (boxs[i] - weights[i]);
		}

		System.out.println(answer);
	}
}
