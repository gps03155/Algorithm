import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] trees = new Integer[n];

        for (int i = 0; i < n; i++) {
            trees[i] = sc.nextInt();
        }

        Arrays.sort(trees, Collections.reverseOrder());
        int day = 2;

        for (int i = 0; i < trees.length; i++) {
            day = Math.max(trees[i] + 2 + i, day);
        }

        System.out.println(day);
    }
}