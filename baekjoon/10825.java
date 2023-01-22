import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		List<HashMap> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			HashMap<String, Object> map = new HashMap<>();
			map.put("name", sc.next());
			map.put("a", sc.nextInt());
			map.put("b", sc.nextInt());
			map.put("c", sc.nextInt());

			list.add(map);
		}

		list.sort(new Comparator<HashMap>() {

			@Override
			public int compare(HashMap o1, HashMap o2) {
				int a = (Integer) o2.get("a") - (Integer) o1.get("a");
				int b = (Integer) o1.get("b") - (Integer) o2.get("b");
				int c = (Integer) o2.get("c") - (Integer) o1.get("c");

				if (a == 0) {
					if (a == 0 && b == 0) {
						if (a == 0 && b == 0 && c == 0) {
							return ((String) o1.get("name")).compareTo((String) o2.get("name"));
						}

						return c;
					}

					return b;
				}

				return a;
			}
		});

		list.forEach(m -> System.out.println(m.get("name")));
	}
}
