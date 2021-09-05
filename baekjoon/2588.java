import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		int line3 = a * (b % 10);
		int line4 = a * ((b % 100) / 10);
		int line5 = a * (b / 100);
		
		int result = line3 + (line4 * 10) + (line5 * 100);
		
		System.out.println(line3 + "\n" + line4 + "\n" + line5 + "\n" + result);
    }
}		
