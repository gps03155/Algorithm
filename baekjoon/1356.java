import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numStr = br.readLine();
		
		for(int i=1; i<numStr.length(); i++) {
			String firstMul = Arrays.stream(numStr.substring(0, i).split("")).reduce((x, y) -> String.valueOf(Long.parseLong(x) * Long.parseLong(y))).get();
			
			for(int j=i; j<numStr.length(); j++) {
				String secondMul = Arrays.stream(numStr.substring(i, numStr.length()).split("")).reduce((x, y) -> String.valueOf(Long.parseLong(x) * Long.parseLong(y))).get();
				
				if(firstMul.equals(secondMul)){
					System.out.println("YES");
					return;
				}
			}
		}
		
		System.out.println("NO");
	}
}
