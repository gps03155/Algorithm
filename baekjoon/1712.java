import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long fixedCost = Long.parseLong(st.nextToken());
		long dynamicCost = Long.parseLong(st.nextToken());
		long price = Long.parseLong(st.nextToken());
		
		if(dynamicCost >= price) System.out.println(-1);
		else System.out.println(fixedCost/(price - dynamicCost) + 1);
	}
}
