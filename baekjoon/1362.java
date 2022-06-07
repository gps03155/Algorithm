import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		long o = Long.parseLong(st.nextToken()); // 적정 체중
		long w = Long.parseLong(st.nextToken()); // 실제 체중

		int count = 1;
		Boolean isDead = false;
		while (true) {
			String status = br.readLine();
			String[] arr = status.split(" ");

			// 먹이
			if ("F".equals(arr[0])) {
				w += Long.parseLong(arr[1]);
			}

			// 운동
			if ("E".equals(arr[0])) {
				w -= Long.parseLong(arr[1]);

				if (w < 1) {
					isDead = true;
				}
			}

			if ("# 0".equals(status)) {
				if (isDead)
					System.out.println(count++ + " RIP");
				else
					System.out.println(count++ + " " + (o * 0.5 < w && w < o * 2 ? ":-)" : ":-("));

				isDead = false;
				st = new StringTokenizer(br.readLine());

				o = Long.parseLong(st.nextToken()); // 적정 체중
				w = Long.parseLong(st.nextToken()); // 실제 체중

				if (o == 0 && w == 0)
					return;
			}
		}
	}
}
