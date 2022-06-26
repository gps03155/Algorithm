import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int getIndex(char cha) {
		if(cha == 'A') return 0;
		if(cha == 'G') return 1;
		if(cha == 'C') return 2;
		
		return 3;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String word = br.readLine();
		
		char[][] board = {
				{'A', 'C', 'A', 'G'},
				{'C', 'G', 'T', 'A'},
				{'A', 'T', 'C', 'G'},
				{'G', 'A', 'G', 'T'}
		};
		
		int index = 1;
		char answer = word.charAt(word.length() - 1);
		
		while(index < word.length()) {
			char second = word.charAt(word.length() - (index + 1));
			
			answer = board[getIndex(second)][getIndex(answer)];
			index++;
		}
		
		System.out.println(answer);
	}
}
