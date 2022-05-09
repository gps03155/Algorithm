import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 3; i++) {
			Integer n = Integer.parseInt(br.readLine());
			BigDecimal sum = new BigDecimal("0");

			for (int j = 0; j < n; j++) {
				BigDecimal num = new BigDecimal(br.readLine());
				sum = sum.add(num);
			}
			
			if ("0".equals(sum.toString())) {
				System.out.println("0");
			} 
			else if (sum.toString().startsWith("-")) {
				System.out.println("-");
			} 
			else {
				System.out.println("+");
			}
		}
	}
}
