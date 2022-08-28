import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String alpha = st.nextToken();
			
			if("#".equals(alpha)) {
				break;
			}
			
			int count = 0;
			
			while(st.hasMoreTokens()) {
				String[] sentence = st.nextToken().split("");
				
				for(int i=0; i<sentence.length; i++) {
					if(alpha.toLowerCase().equals(sentence[i].toLowerCase())) {
						count++;
					}
				}
			}
			
			System.out.println(alpha + " " + count);
		}
	}
}
