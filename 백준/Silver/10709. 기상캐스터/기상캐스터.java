import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] sky = new int[h][w];

        for (int i = 0; i < h; i++) {
            int cloudIndex = -1;
            String cloud = sc.next();

            for (int j = 0; j < w; j++) {
                char cha = cloud.charAt(j);

                if (cha == 'c') {
                    cloudIndex = j;
                }

                if (cloudIndex > -1) {
                    sky[i][j] = j - cloudIndex;
                } else if (cha == '.') {
                    sky[i][j] = -1;
                }

                System.out.print(sky[i][j] + " ");
            }
            System.out.println();
        }
    }
}