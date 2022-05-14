import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			int existCnt = 1;
			
			while(st.hasMoreTokens()) {
				int year = Integer.parseInt(st.nextToken());
				if(year == 0) return;
				
				for(int i=0; i<year*2; i++) {
					int num = Integer.parseInt(st.nextToken());
					if(i%2 == 0) existCnt *= num;
					else existCnt -= num;
				}
			}
			
			System.out.println(existCnt);
		}
	}
}
