import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            int sum = 0;
            for (int j = start; j <= end; j++) {
                sum += String.valueOf(j).chars().filter(m -> m == '0').count();
            }

            System.out.println(sum);
        }
    }
}