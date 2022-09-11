import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		int[] alpha = new int[26];
		
		for(char cha : word.toCharArray()) {
			alpha[Character.toUpperCase(cha) - 65]++;
		}
		
		int max = IntStream.of(alpha).max().getAsInt();
		int index = 0;
		int count = 0;
		
		for(int i=0; i<alpha.length; i++) {
			if(alpha[i] == max) {
				count++;
				index = i;
			}

			if(count > 1) {
				System.out.println("?");
				return;
			}
		}
		
		System.out.println((char) (index + 65));
	}
}
