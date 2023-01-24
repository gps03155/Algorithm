import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		Map<Long, Long> map = new TreeMap<>();
		for (int i = 0; i < t; i++) {
			Long num = sc.nextLong();
			map.put(num, map.getOrDefault(num, (long) 0) + 1);
		}

		long max = map.values().stream().mapToLong(m -> m).max().getAsLong();

		for (Entry<Long, Long> m : map.entrySet()) {
			if (m.getValue() == max) {
				System.out.println(m.getKey());
				return;
			}
		}
	}
}