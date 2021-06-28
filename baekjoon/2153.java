import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		int sum = 0;
		
		for(int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				sum += ch - 38;
			}
			else {
				sum += ch - 96;
			}
		}
		
		Boolean isPrime = true;
		
		if(sum % 2 == 0) isPrime = false;
		
		for(int i=2; i<sum; i++) {
			if(sum % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		System.out.println(isPrime? "It is a prime word." : "It is not a prime word.");
    }
}
