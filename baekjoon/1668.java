import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] heights = new int[n];
		
		for(int i=0; i<n; i++) {
			heights[i] = Integer.parseInt(br.readLine());
		}
		
		int left = 1;
		int leftMax = heights[0];
		
		for(int i=0; i<n; i++) {
			if(heights[i] > leftMax) {
				left++;
				leftMax = heights[i];
			}
		}
		
		int right = 1;
		int rightMax = heights[n-1];
		
		for(int i=n-1; i>=0; i--) {
			if(heights[i] > rightMax) {
				right++;
				rightMax = heights[i];
			}
		}
		
		System.out.println(left);
		System.out.println(right);
	}
}
