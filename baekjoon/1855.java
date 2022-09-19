import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		String crypt = br.readLine();
		
		int row = crypt.length() / k;
		char[][] word = new char[row][k];
		
		int start = 0, end = k;
		
		for(int i=0; i<row; i++) {
			String str = crypt.substring(start, end);
			
			for(int j=0; j<k; j++) {
				if(i % 2 == 0) {
					word[i][j] = str.charAt(j);
				}
				else {
					word[i][j] = str.charAt(str.length() - j - 1);
				}
			}
			
			start = end;
			end = Math.min(end + k, crypt.length());
		}
		
		StringBuilder builder = new StringBuilder();
		for(int i=0; i<k; i++) {
			for(int j=0; j<row; j++) {
				builder.append(word[j][i]);
			}
		}
		
		System.out.println(builder.toString());
	}
}
