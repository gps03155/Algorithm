import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int[] seatArr = new int[101];
		int fail = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < num; i++) {
			int pos = Integer.parseInt(st.nextToken());
			
			
			if(seatArr[pos] != 0) fail++;
			else seatArr[pos] = 1;
		}
		
		System.out.println(fail);
    }
}
