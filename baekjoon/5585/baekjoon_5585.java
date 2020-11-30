import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int[] value = {500, 100, 50, 10, 5, 1};
        int count = 0;
        
        price = 1000 - price;
        
        for(int i=0;i<value.length;i++){
            count += price / value[i];
            price %= value[i];
        }
        
        System.out.println(count);
        
    }
}
