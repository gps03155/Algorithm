import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		BigDecimal decimal = new BigDecimal(0.5).pow(n);
		
		String value = String.format("%.250f", decimal);
		int index = 0;

		for(int i=value.length() - 1; i>=0; i--) {
			if(value.charAt(i) != '0') {
				index = i;
				break;
			}
		}
		
		System.out.println(value.substring(0, index + 1));
	}
}
