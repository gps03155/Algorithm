import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();

		List<HashMap> list = new ArrayList<>();
		for (int i = 0; i < test; i++) {
			HashMap<String, Integer> map = new HashMap<>();
			map.put("x", sc.nextInt());
			map.put("y", sc.nextInt());
			list.add(map);
		}

		list = list.stream().sorted(Comparator.comparingInt(m -> (int) ((HashMap) m).get("x"))
				.thenComparingInt(m -> (int) ((HashMap) m).get("y"))).collect(Collectors.toList());
		
		list.forEach(m -> System.out.println(m.get("x") + " " + m.get("y")));
	}
}
