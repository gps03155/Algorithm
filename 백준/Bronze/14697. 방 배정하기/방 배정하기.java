import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int students = sc.nextInt();

        for (int i = 1; i <= 50; i++) {
            for (int j = 1; j <= 50; j++) {
                for (int k = 1; k <= 50; k++) {
                    if (a * i + b * j + c * k == students) {
                        System.out.println(1);
                        return;
                    }
                }
            }
        }

        System.out.println(0);
    }
}