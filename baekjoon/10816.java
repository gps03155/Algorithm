import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] cards = new int[n];

		for (int i = 0; i < n; i++) {
			cards[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		int[] nums = new int[m];

		for (int i = 0; i < m; i++) {
			nums[i] = sc.nextInt();
		}

		Map<Integer, List<Integer>> map = Arrays.stream(cards).boxed().collect(Collectors.groupingBy(o -> o));

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < nums.length; i++) {
			sb.append(map.containsKey(nums[i])? map.get(nums[i]).size() : 0).append(" ");
		}
		
		System.out.println(sb.toString());
	}
}
