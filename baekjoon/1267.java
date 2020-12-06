import java.util.*;

public class Main{
    public static void main(String[] args){
        
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int yTime = 30;
		int mTime = 60;
		
		int yPrice = 10;
		int mPrice = 15;
		
		int ySum = 0;
		int mSum = 0;
		
		for(int i=0;i<num;i++) {
			int time = sc.nextInt();
			
			if(time/yTime == 0) {
				ySum += yPrice;
			}
			
			if(time/mTime == 0) {
				mSum += mPrice;
			}
			
			if(time/yTime > 0) {
				ySum += (yPrice * (time/yTime + 1));
			}
			
			if(time/mTime > 0) {
				mSum += (mPrice * (time/mTime + 1));
			}
		}
		
		if(ySum < mSum) System.out.println("Y " + ySum);
		if(mSum < ySum) System.out.println("M " + mSum);
		if(ySum == mSum) System.out.println("Y M " + ySum);
    }
}
