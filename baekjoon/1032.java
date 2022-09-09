import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test = Integer.parseInt(br.readLine());
		String[] str = new String[test];

		for (int i = 0; i < test; i++) {
			str[i] = br.readLine();
		}

		StringBuilder builder = new StringBuilder(str[0]);

		String word = str[0];

		for (int j = 1; j < str.length; j++) {
			char[] cha = str[j].toCharArray();
			
			for(int i=0; i<cha.length; i++) {	
				if (word.charAt(i) != cha[i]) {
					builder.setCharAt(i, '?');
				}
			}
		}
		
		System.out.println(builder);
	}
}
