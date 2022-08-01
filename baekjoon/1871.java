import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		for(int i=0; i<test; i++) {
			String[] license = br.readLine().split("-");
			
			int first = 0;
			for(int j=0; j<license[0].length(); j++) {
				first += Math.pow(26, license[0].length() - j - 1) * (license[0].charAt(j) - 65);
			}
			
			Boolean isNice = Math.abs(first - Integer.parseInt(license[1])) <= 100;
			
			if(isNice) System.out.println("nice");
			else System.out.println("not nice");
		}
	}
}
