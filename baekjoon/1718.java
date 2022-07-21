import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String plain = br.readLine();
		String crypt = br.readLine();

		char[] plainArr = plain.toCharArray();
		char[] cryptArr = crypt.repeat(plain.length()).toCharArray();
		
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < plainArr.length; i++) {
			if(plainArr[i] == ' ' ) {
				builder.append(" ");
				continue;
			}
			
			char alpha = (char) ((plainArr[i] - cryptArr[i]) + 96);
			
			if(alpha < 97) {
				int diff = 96 - alpha;
				alpha = (char) (122 - diff);
			}
			
			builder.append(alpha);
		}
		
		System.out.println(builder);
	}
}
