import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken()); // 운동 시간
		int m = Integer.parseInt(st.nextToken()); // 초기 맥박
		int M = Integer.parseInt(st.nextToken()); // 최대 맥박
		int T = Integer.parseInt(st.nextToken()); // 운동 시 맥박 추가
		int R = Integer.parseInt(st.nextToken()); // 휴식 시 맥박 감소

		int heart = m;
		int count = 0;
		int time = 0;
		
		while(count < N) {
			if(m + T > M) break;
			time++;
			
			if (heart + T <= M) {
				heart += T;
				count++;
			} else {
				heart = Math.max(heart - R, m);
			}
		}
		
		System.out.println(time > 0? time : -1);
	}
}
