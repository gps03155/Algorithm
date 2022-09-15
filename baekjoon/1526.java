import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		for(int i=n; i>0; i--) {
			if(String.valueOf(i).chars().allMatch(m -> m == '4' || m == '7')) {
				System.out.println(i);
				break;
			}
		}
	}
}
