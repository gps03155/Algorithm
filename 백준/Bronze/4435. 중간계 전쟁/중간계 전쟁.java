import java.util.Scanner;

public class Main {
    public static void print(int t, int gan, int sa) {
        if (gan > sa) {
            System.out.printf("Battle %d: Good triumphs over Evil", t);
        } else if (sa > gan) {
            System.out.printf("Battle %d: Evil eradicates all trace of Good", t);
        } else {
            System.out.printf("Battle %d: No victor on this battle field", t);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] gans = {1, 2, 3, 3, 4, 10};
        int[] sas = {1, 2, 2, 2, 3, 5, 10};

        for (int i = 0; i < t; i++) {
            int gan = 0, sa = 0;

            for (int j = 0; j < 6; j++) {
                gan += gans[j] * sc.nextInt();
            }

            for (int k = 0; k < 7; k++) {
                sa += sas[k] * sc.nextInt();
            }
            print(i + 1, gan, sa);
        }
    }
}