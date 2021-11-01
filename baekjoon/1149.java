import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test = Integer.parseInt(br.readLine());

		int[][] result = new int[test+1][3];
		
		for(int i=1; i<=test; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			result[i][0] = Math.min(result[i-1][1], result[i-1][2]) + Integer.parseInt(st.nextToken());
			result[i][1] = Math.min(result[i-1][0], result[i-1][2]) + Integer.parseInt(st.nextToken());
			result[i][2] = Math.min(result[i-1][0], result[i-1][1]) + Integer.parseInt(st.nextToken());
		}
		
		System.out.println(Math.min(result[test][0],  Math.min(result[test][1], result[test][2])));
	}
}
