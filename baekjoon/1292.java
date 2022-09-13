import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		
		int count = 1;
		int num = 1;
		int sum = 0;
		
		while(true) {
			if(count > end) {
				System.out.println(sum);
				return;
			}
			
			for(int i=0; i<num; i++) {
				if(start <= count && count <= end) {
					sum += num;
				}
				
				count++;
			}
			
			num++;
		}
	}
}
