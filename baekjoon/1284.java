import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String num = br.readLine();
			if("0".equals(num)) break;
			
			String[] nums = num.split("");
			int width = 1;
			
			for(int i=0; i<nums.length; i++) {
				if("0".equals(nums[i])) width += 4;
				else if("1".equals(nums[i])) width += 2;
				else width += 3;
				
				width++;
			}
			
			System.out.println(width);
		}
	}
}
