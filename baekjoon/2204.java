import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		while(test > 0) {
			List<String> origin = new ArrayList<>();
			
			for(int i=0; i<test;i++) {
				origin.add(br.readLine());
			}
			
			List<String> list = origin.stream().map(m -> m.toLowerCase()).collect(Collectors.toList());
			list.sort(Comparator.naturalOrder());
			
			String answer = origin.stream().filter(m -> m.toLowerCase().equals(list.get(0))).findFirst().orElseGet(String::new);
			System.out.println(answer);
			
			test = Integer.parseInt(br.readLine());
		}
	}
}
