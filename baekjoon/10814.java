import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		String[][] s = new String[test][2];
		
		for(int i=0; i<test; i++) {
			String[] input = br.readLine().split(" ");
			s[i][0] = input[0];
			s[i][1] = input[1];
		}
		
		Arrays.sort(s, Comparator.comparingInt(m -> Integer.parseInt(m[0])));
		
		for(String[] str : s) {
			System.out.println(str[0] + " " + str[1]);
		}
	}
}
