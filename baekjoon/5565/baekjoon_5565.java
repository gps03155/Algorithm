import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int[] price = new int[9];
        int sum = 0;
        
        for(int i=0;i<9;i++){
            price[i] = sc.nextInt();
            sum += price[i];
        }
        
        System.out.println(total - sum);
    }
}
