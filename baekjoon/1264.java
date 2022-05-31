import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String sentence = br.readLine();
			if("#".equals(sentence)) break;
			
			int count = 0;
			for(char alpha : sentence.toCharArray()) {
				if(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').contains(alpha)) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
