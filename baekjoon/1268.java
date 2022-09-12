import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test = Integer.parseInt(br.readLine());
		int[][] student = new int[test][5];
		boolean[][] result = new boolean[test][test];

		for (int i = 0; i < test; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int index = 0;

			while (st.hasMoreTokens()) {
				student[i][index++] = Integer.parseInt(st.nextToken());
			}
		}

		int num = 0;

		while (num < test) {
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < test; j++) {
					if (num == j) {
						continue;

					}

					if (student[num][i] == student[j][i]) {
						if (!result[num][j]) {
							result[num][j] = true;
						}
					}
				}
			}
			num++;
		}
		
		int max = Integer.MIN_VALUE;
		int answer = 0;
		
		for(int i=0; i<test; i++) {
			int count = 0;

			for(int j=0; j<test; j++) {
				if(result[i][j]) {
					count++;
				}
			}
			
			if(count > max) {
				max = count;
				answer = i;
			}
		}
		
		System.out.println(answer + 1);
	}
}
