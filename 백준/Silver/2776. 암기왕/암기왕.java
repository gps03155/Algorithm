import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] nArr = new int[n];
            for (int j = 0; j < n; j++) nArr[j] = sc.nextInt();

            int m = sc.nextInt();
            int[] mArr = new int[m];
            for (int j = 0; j < m; j++) mArr[j] = sc.nextInt();

            Arrays.sort(nArr);

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < mArr.length; j++) {
                sb.append(Arrays.binarySearch(nArr, mArr[j]) < 0 ? 0 : 1).append("\n");
            }

            sb.deleteCharAt(sb.length() - 1);
            System.out.println(sb.toString());
        }
    }
}