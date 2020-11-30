import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int value = sc.nextInt();
        int count = 0;
        int result = 0;
        
        int[] price = new int[num];
        
        for(int i=0;i<num;i++){
            price[i] = sc.nextInt();
        }
        
        for(int i=price.length-1;i>=0;i--){
            result = value / price[i];
            value %= price[i];
            
            count += result;
        }
        
        System.out.println(count);
    }
}
