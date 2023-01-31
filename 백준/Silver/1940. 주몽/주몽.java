import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        int cnt = 0;
        for(int i=0; i<nums.length; i++){
            long sum = nums[i];

            for(int j=i+1; j<nums.length; j++){
                sum += nums[j];

                if(sum == m){
                    cnt++;
                }

                sum = nums[i];
            }

        }

        System.out.println(cnt);
    }
}