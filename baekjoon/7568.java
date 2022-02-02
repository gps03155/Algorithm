/** 브루트포스 **/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer test = Integer.parseInt(br.readLine());

		int[][] person = new int[test][2];

		for (int i = 0; i < test; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Integer weight = Integer.parseInt(st.nextToken());
			Integer height = Integer.parseInt(st.nextToken());

			person[i][0] = weight;
			person[i][1] = height;
		}

		for (int i = 0; i < test; i++) {
   		   	// rank 초기화
			int rank = 1;
			
			for (int j = 0; j < test; j++) {
        			// weight && height 비교 (큰 값 존재할 경우 rank 증가)
				if(person[j][0] > person[i][0] && person[j][1] > person[i][1]) {
					rank++;
				}
			}
			
			System.out.println(rank);
		}
	}
}
