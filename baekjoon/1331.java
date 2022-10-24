import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static boolean isValid(String[] prevPos, String[] pos) {
		if ((Math.abs(prevPos[0].toCharArray()[0] - pos[0].toCharArray()[0]) == 2
				&& Math.abs(Integer.parseInt(prevPos[1]) - Integer.parseInt(pos[1])) == 1)
				|| (Math.abs(prevPos[0].toCharArray()[0] - pos[0].toCharArray()[0]) == 1
						&& Math.abs(Integer.parseInt(prevPos[1]) - Integer.parseInt(pos[1])) == 2)) {
			return true;
		}
	
		return false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		String[][] board = new String[6][6];
		
		int index = 0;
		String[] prevPos = new String[str.length()];
		String firstPos = "";
		String lastPos = "";
		
		boolean isValid = true;
		
		while((str = br.readLine()) != null && str.length() != 0) {
			String[] pos = str.split("");
			
			if(board[pos[0].toCharArray()[0] - 65][Integer.parseInt(pos[1]) - 1] != null) {
				isValid = false;
			}
			
			if(index == 0) {
				firstPos = str;
			}
			
			if(index > 0) {
				if(isValid) {
					isValid = isValid(prevPos, pos);
				}
			}
			
			if(index == 35) {
				lastPos = str;
			}
			
			board[pos[0].toCharArray()[0] - 65][Integer.parseInt(pos[1]) - 1] = str;
			prevPos = pos;
			index++;
		}
		
		if(isValid) {
			isValid = isValid(firstPos.split(""), lastPos.split(""));
		}
		
		for(int i=1; i<6; i++) {
			for(int j=1; j<6; j++) {
				if(board[i][j] == null) {
					isValid = false;
				}
			}
		}
		
		System.out.println(isValid? "Valid" : "Invalid");
	}
}
