import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;
import java.util.stream.Stream;


public class Main {
	static int whiteCount = 0;
	static int blueCount = 0;
	static int[][] board;
	
	public static boolean isEquals(int row, int col, int size) {
		int first = board[row][col];
		
		for(int i=row; i<row+size; i++) {
			for(int j=col; j<col+size; j++) {
				if(board[i][j] != first) return false;
			}
		}
		
		return true;
	}
	
	public static void recursiveBoard(int row, int col, int size) {
		
		if(isEquals(row, col, size)) {
			if(board[row][col] == 0) whiteCount++;
			if(board[row][col] == 1) blueCount++;
			
			return;
		}
		
		size /= 2;

		recursiveBoard(row, col, size);
		recursiveBoard(row, col + size, size);
		recursiveBoard(row + size, col, size);
		recursiveBoard(row + size, col + size, size);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		board = new int[size][size];
		
		StringTokenizer st;
		
		for(int row=0; row<size; row++) {
			st = new StringTokenizer(br.readLine());
			for(int col=0; col<size; col++) {
				board[row][col] = Integer.parseInt(st.nextToken());
			}
		}
		
		recursiveBoard(0, 0, size);
		
		System.out.println(whiteCount + " " + blueCount);
	}
}
