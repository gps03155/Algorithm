import java.util.Scanner;

public class Main {
    private static long[] fibos;

    public static long fibo(int n) {
        if (n < 2) {
            fibos[n] = 1;
        } else if (n == 2) {
            fibos[n] = 2;
        } else if (n == 3) {
            fibos[n] = 4;
        }

        if (fibos[n] != 0) return fibos[n];
        else fibos[n] = fibo(n - 1) + fibo(n - 2) + fibo(n - 3) + fibo(n - 4);

        return fibos[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        fibos = new long[68];

        for (int i = 0; i < n; i++) {
            System.out.println(fibo(sc.nextInt()));
        }
    }
}