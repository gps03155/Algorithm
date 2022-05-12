import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer test = Integer.parseInt(br.readLine());
		
		int pos = 1;
		
		for(int i=0; i<test; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Integer x = Integer.parseInt(st.nextToken());
			Integer y = Integer.parseInt(st.nextToken());
			
			if(x == pos) pos = y;
			else if(y == pos) pos = x;
		}
		
		System.out.println(pos);
	}
}
