import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		List<HashMap> list = new ArrayList<>();
		
		for(int i=0; i<test; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			HashMap<String, Integer> map = new HashMap<>();
			
			map.put("x", Integer.parseInt(st.nextToken()));
			map.put("y", Integer.parseInt(st.nextToken()));
			
			list.add(map);
		}
		
		list = list.stream().sorted(Comparator.comparing(m -> (int)((HashMap) m).get("y")).thenComparing(m -> (int) ((HashMap) m).get("x"))).collect(Collectors.toList());
		
		for(int i=0; i<list.size(); i++) {
			HashMap<String, Integer> map = list.get(i);
			System.out.println(map.get("x") + " " + map.get("y"));
		}
	}
}
