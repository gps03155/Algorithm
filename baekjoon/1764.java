import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < n + m; i++) {
			String name = sc.next();
			map.put(name, map.getOrDefault(name, 0) + 1);
		}

		Map<String, Integer> result = map.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		List<String> keySet = new ArrayList<>(result.keySet());
		Collections.sort(keySet);

		System.out.println(keySet.size());
		keySet.forEach(key -> System.out.println(key));
	}
}
