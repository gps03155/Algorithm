import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i=0; i<test; i++) {
			String word = br.readLine();
			boolean[] checkWord = new boolean[26];
			boolean isGroup = true;
			
			checkWord[word.charAt(0) - 97] = true;
			
			for(int j=1; j<word.length(); j++) {
				if(checkWord[word.charAt(j) - 97] && word.charAt(j) != word.charAt(j -1)) {
					isGroup = false;
					break;
				}
				
				checkWord[word.charAt(j) - 97] = true;
			}
			
			if(isGroup) count++;
		}
		
		System.out.println(count);
	}
}
