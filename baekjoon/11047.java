import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Long n = Long.parseLong(st.nextToken());
		Long total = Long.parseLong(st.nextToken());
		
		List<Long> price = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			price.add(Long.parseLong(br.readLine()));
		}
		
		price.sort(Comparator.reverseOrder());
		
		int count = 0;
		
		for(Long cost : price) {
			count += (total/cost);
			total %= cost;
		}
		
		System.out.println(count);
	}
}
