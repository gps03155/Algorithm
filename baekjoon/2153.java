import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int getNum(char alpha) {
		if('a' <= alpha && alpha <= 'z') {
			return alpha - 96;
		}

		return alpha - 38;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		
		int sum = 0;
		
		for(char cha : word.toCharArray()) {
			sum += getNum(cha);
		}
		
		Boolean isPrime = true;

		for(int i=2; i<sum; i++) {
			if(sum % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		System.out.println(isPrime? "It is a prime word." : "It is not a prime word.");
	}
}
