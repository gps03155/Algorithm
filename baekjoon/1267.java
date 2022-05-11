import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer num = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int yPrice = 0, mPrice = 0;
		
		while(st.hasMoreTokens()) {
			Integer time = Integer.parseInt(st.nextToken());
			
			yPrice += (time / 30);
			if(time % 30 >= 0) yPrice++;

			mPrice += (time / 60);
			if(time % 60 >= 0) mPrice++;
		}
		
		yPrice *= 10;
		mPrice *= 15;
		
		if(mPrice < yPrice) System.out.println("M " + mPrice);
		else if(yPrice < mPrice) System.out.println("Y " + yPrice);
		else System.out.println("Y M " + yPrice);
	}
}
