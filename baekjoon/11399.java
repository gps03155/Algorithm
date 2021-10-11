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
		br.readLine();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList();
		
		while(st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		list.sort(Comparator.naturalOrder());
		
		int sum = 0, total = 0;
		
		for(int time : list) {
			sum += time;
			total += sum;
		}
		
		System.out.println(total);
	}
}
