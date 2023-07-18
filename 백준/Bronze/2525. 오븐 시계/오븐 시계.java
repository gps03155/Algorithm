import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        a += (b + c) / 60;
        b = (b + c) % 60;

        System.out.print(a % 24 + " " + b);
    }
}