import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Set<String> list = new TreeSet<>();
		for(int i=0; i<n; i++) {
			String[] inputs = br.readLine().split(" ");
			
			if("enter".equals(inputs[1])) {
				list.add(inputs[0]);
			}
			else {
				list.remove(inputs[0]);
			}
		}
		
		list = new TreeSet<>(list).descendingSet();
		
		for(String name : list) {
			System.out.println(name);
		}
	}
}
