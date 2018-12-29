import java.util.Arrays;
import java.util.Scanner;


public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int[] timeArr = new int[people];
        int sum = 0;
        
        for(int i=0;i<people;i++){
            timeArr[i] = sc.nextInt();
        }
        
        Arrays.sort(timeArr);
        
        for(int i=0;i<timeArr.length;i++){
            for(int j=0;j<i+1;j++){
                sum += timeArr[j];
            }
        }
        
        System.out.println(sum);
    }
    
}
