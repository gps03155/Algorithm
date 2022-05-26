import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		int[] ascii = new int[123];
		
		for(int i=0; i<test; i++) {
			String name = br.readLine();
			int count = ascii[name.charAt(0)] + 1;
			ascii[name.charAt(0)] = count;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=97; i<ascii.length; i++) {
			if(ascii[i] >= 5) {
				sb.append((char)i);
			}
		}
		
		System.out.println(sb.toString().isEmpty()? "PREDAJA" : sb.toString());
	}
}
