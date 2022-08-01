import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int getNum(char cha) {
		switch(cha) {
		case '-': return 0;
		case '\\': return 1;
		case '(': return 2;
		case '@': return 3;
		case '?': return 4;
		case '>': return 5;
		case '&': return 6;
		case '%': return 7;
		case '/': return -1;
		}
		
		return cha;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String word = br.readLine();
			
			if(word.equals("#")) break;
			int answer = 0;
			
			for(int i=0; i<word.length(); i++) {
				answer += (int) (Math.pow(8, word.length() - i - 1) * getNum(word.charAt(i))); 
			}
			
			System.out.println(answer);
		}
	}
}
