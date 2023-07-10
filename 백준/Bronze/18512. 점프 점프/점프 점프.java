import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();

        int[] a = new int[100];
        int[] b = new int[100];

        a[0] = p1;
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i - 1] + x;
        }

        b[0] = p2;
        for (int j = 1; j < b.length; j++) {
            b[j] = b[j - 1] + y;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                    return;
                }
            }
        }

        System.out.println(-1);
    }
}