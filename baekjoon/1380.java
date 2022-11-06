import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = 1;
		
		while(true) {
			int people = Integer.parseInt(br.readLine());
			
			if(people == 0) {
				return;
			}
			
			String[] names = new String[people];
			
			for(int i=0; i<names.length; i++) {
				names[i] = br.readLine();
			}
			
			boolean[][] board = new boolean[people][2];
			
			for(int i=0; i<2*people - 1; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				board[Integer.parseInt(st.nextToken()) - 1][st.nextToken().charAt(0) - 'A'] = true;
			}
			
			for(int i=0; i<people; i++) {
				for(int j=0; j<2; j++) {
					if(!board[i][j]) {
						System.out.println(count + " " + names[i]);
						break;
					}
				}
			}
			count++;
		}
	}
}
