import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println("*");
            return;
        }

        for (int i = 0; i < n * 2; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    System.out.print(j % 2 == 0 ? "*" : " ");
                } else {
                    System.out.print(j % 2 != 0 ? "*" : " ");
                }
            }
            System.out.println();
        }
    }
}