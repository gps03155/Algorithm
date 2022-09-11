import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());
		
		char[][] board = new char[row][col];
		
		for(int i=0; i<row; i++) {
			char[] charArr = br.readLine().toCharArray();
			
			for(int j=0; j<charArr.length; j++) {
				board[i][j] = charArr[j];
			}
		}
		
		int rowCnt = 0;
		
		for(int i=0; i<row; i++) {
			Boolean isSecurity = false;
			
			for(int j=0; j<col; j++) {
				if(board[i][j] == 'X') {
					isSecurity = true;
				}
			}
			
			if(!isSecurity) {
				rowCnt++;
			}
		}
		
		int colCnt = 0;
		
		for(int i=0; i<col; i++) {
			Boolean isSecurity = false;
			
			for(int j=0; j<row; j++) {
				if(board[j][i] == 'X') {
					isSecurity = true;
				}
			}
			
			if(!isSecurity) {
				colCnt++;
			}
		}
		
		System.out.println(Math.max(rowCnt, colCnt));
	}
}
