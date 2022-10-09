import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test = Integer.parseInt(br.readLine());
		
		for(int i=0; i<test; i++) {
			br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int row = Integer.parseInt(st.nextToken());
			int col = Integer.parseInt(st.nextToken());
			
			char[][] board =	new char[row][col];
			
			for(int k=0; k<row; k++) {
				String input = br.readLine();
				
				for(int j=0; j<col; j++) {
					board[k][j] = input.charAt(j);
				}
			}
			
			int cnt = 0;
			for(int j=0; j<row; j++) {
				for(int k=0; k<col; k++) {
					if(k+2 < col && '>' == board[j][k] && 'o' == board[j][k+1] && '<' == board[j][k+2]) {
						cnt++;
					}
					
					if(j+2 < row && 'v' == board[j][k] && 'o' == board[j+1][k] && '^' == board[j+2][k]) {
						cnt++;
					}
				}
			}
			
			System.out.println(cnt);
		}
	}
}
