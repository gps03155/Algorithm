import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int quater = 1;
		
		if(x < 0 && y > 0) quater = 2;
		if(x < 0 && y < 0) quater = 3;
		if(x > 0 && y < 0) quater = 4;
        
        System.out.println(quater);
    }
}
