import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int person = sc.nextInt();
        int place = sc.nextInt();
        int[] sub = new int[5];
        
        for(int i=0;i<5;i++){
            sub[i] = sc.nextInt();
            sub[i] = sub[i] - (person * place);
        }
                
        for(int result:sub){
            System.out.print(result + " ");
        }
        
        System.out.println();
    }
}
