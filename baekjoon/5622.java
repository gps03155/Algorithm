import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		Integer time = 0;
		
		int[] timeArr = { 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10 };
		
		// 문자열로 나열하여 푸는 방법도 있지만 코드 길이나 메모리를 비교했을 때 아스키코드로 계산하는 방법이 더 나음
		for (char cha : word.toCharArray()) {
			time += timeArr[cha-'A'];
		}
		
		System.out.print(time);
	}
}
