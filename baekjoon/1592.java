import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		
		int[] people = new int[n+1];
		
		people[1] = 1;
		
		int pos = 1;
		int count = 0;
		
		while(true) {
			if(people[pos] == m) {
				break;
			}
			
			if(people[pos] % 2 != 0) {
				for(int i=0; i<l; i++) {
					if(pos + 1 > n) {
						pos = 1;
					}
					else {
						pos++;
					}
				}
				
				people[pos]++;
			}
			else {
				for(int i=0; i<l; i++) {
					if(pos - 1 < 1) {
						pos = n;
					}
					else {
						pos--;
					}
				}
				
				people[pos]++;
			}
			
			count++;
		}
		
		System.out.println(count);
	}
}
