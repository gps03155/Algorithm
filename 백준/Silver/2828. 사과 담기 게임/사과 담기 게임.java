import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int num = sc.nextInt();
        int[] apples = new int[num];

        for (int i = 0; i < num; i++) {
            apples[i] = sc.nextInt();
        }

        int count = 0;
        int start = 1, end = m;

        for (int i = 0; i < apples.length; i++) {
            if (apples[i] > end) {
                int dis = apples[i] - end;
                count += dis;
                end += dis;
                start += dis;
            }
            if (apples[i] < start) {
                int dis = start - apples[i];
                count += dis;
                start -= dis;
                end -= dis;
            }
        }

        System.out.println(count);
    }
}