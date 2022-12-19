import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int[][] condos = new int[t][2];
		
		for(int i=0; i<t; i++) {
			String[] inputs = br.readLine().split(" ");
			condos[i][0] = Integer.parseInt(inputs[0]);
			condos[i][1] = Integer.parseInt(inputs[1]);
		}
		
		int count = 0;
		
		for(int i=0; i<t; i++) {
			Boolean isCandid = true;
			
			for(int j=0; j<t; j++) {
				if(condos[i][0] > condos[j][0]) {
					if(condos[i][1] >= condos[j][1]) {
						isCandid = false;
					}
				}
				
				if(condos[i][1] > condos[j][1]) {
					if(condos[i][0] >= condos[j][0]) {
						isCandid = false;
					}
				}
			}
			
			if(isCandid) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
