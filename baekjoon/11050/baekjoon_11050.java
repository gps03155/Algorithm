import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int up = 1;
        int down;
        int downOne = 1, downTwo = 1;
        
        for(int i=1;i<=n;i++){
            up *= i;
        }
        
        for(int i=1;i<=k;i++){
            downOne *= i;
        }
        
        for(int i=1;i<=(n-k);i++){
            downTwo *= i;
        }
        
        down = downOne * downTwo;
        
        System.out.println(up / down);
    }    
}
