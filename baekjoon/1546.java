import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		double[] scores = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
		
		Arrays.sort(scores);
		
		double max = scores[scores.length - 1];
		
		double[] newScores = new double[scores.length];
		for(int i=0; i<scores.length; i++) {
			newScores[i] = scores[i]/max * 100;
		}
		
		System.out.println(Arrays.stream(newScores).average().getAsDouble());
	}
}
