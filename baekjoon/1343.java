import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String pattern = br.readLine();
		
		if(pattern.indexOf("X") == -1) {
			System.out.println(pattern);
			return;
		}
		
		String[] board = pattern.split(Pattern.quote("."));
		StringBuilder builder = new StringBuilder();
		
		Boolean isPoly = true;

		for(int i=0; i<board.length; i++) {
			String x = board[i];
			
			while(!x.isEmpty()) {
				if(x.contains(" ")) {
					builder.append("\\.");
					x = x.replaceFirst(" ", "");
				}
				if(x.length() >= 4) {
					builder.append("AAAA");
					x = x.replaceFirst("XXXX", "");
				}
				else if(2 <= x.length() && x.length() < 4) {
					builder.append("BB");
					x = x.replaceFirst("XX", "");
				}
				else {
					x = "";
					isPoly = false;
				}
			}
			
			if(i < board.length - 1) {
				builder.append(".");
			}
		}
		
		builder.append(pattern.substring(pattern.lastIndexOf("X") + 1));
		System.out.println(isPoly? builder.toString() : "-1");
	}
}
