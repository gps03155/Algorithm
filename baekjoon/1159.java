import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		int[] ascii = new int[26];
		
		for(int i=0; i<test; i++) {
			String name = br.readLine();
			ascii[name.charAt(0) - 97]++;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<ascii.length; i++) {
			if(ascii[i] >= 5) {
				sb.append((char)(i + 97));
			}
		}
		
		System.out.println(sb.toString().isEmpty()? "PREDAJA" : sb.toString());
	}
}
