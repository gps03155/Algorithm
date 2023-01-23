import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Set<Integer> aList = new HashSet<>();
		Set<Integer> bList = new HashSet<>();
		
		for(int i=0; i<a; i++) aList.add(sc.nextInt());
		for(int i=0; i<b; i++) bList.add(sc.nextInt());
				
		Set<Integer> tempList = new HashSet<>(aList);
		aList.removeAll(bList);
		bList.removeAll(tempList);
		
		System.out.println(aList.size() + bList.size());
	}
}