import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();

		int min = Integer.MAX_VALUE;

		for(int j=0; j<b.length() - a.length() + 1; j++) {
			int cnt =0;
			for (int i = 0; i < a.length(); i++) {
				if(a.charAt(i) != b.charAt(i + j)) {
					cnt++;
				}
			}
			if(cnt < min) min = cnt;
		}
		
		System.out.println(min);
	}
}