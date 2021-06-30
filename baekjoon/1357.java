import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long sum = 0;
		
		for(int i=0; i<st.countTokens() + 1; i++) {
			String num = st.nextToken();
			
			StringBuffer sb = new StringBuffer(num);
			sum += Long.parseLong(sb.reverse().toString());
		}
	
        System.out.println(Long.parseLong(new StringBuffer(String.valueOf(sum)).reverse().toString()));
    }
}
