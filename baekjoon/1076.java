import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
		String answer = "";
		
		for (int i = 0; i < 3; i++) {
			int index = Arrays.asList(colors).indexOf(br.readLine());
			answer = i < 2? answer + index : answer + "0".repeat(index);
		}
		
		System.out.println(Long.parseLong(answer));
	}
}
