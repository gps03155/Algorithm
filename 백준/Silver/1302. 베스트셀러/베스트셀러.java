import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String title = br.readLine();
			map.put(title, (int) map.getOrDefault(title, 0) + 1);
		}

		List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

		list.sort(new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				int a = o2.getValue() - o1.getValue();

				if (a == 0) {
					return o1.getKey().compareTo(o2.getKey());
				}

				return a;
			}
		});

		System.out.println(list.get(0).getKey());
	}
}