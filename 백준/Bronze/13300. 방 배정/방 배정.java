import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int max = sc.nextInt();

        int count = 0;
        int[][] rooms = new int[7][2];
        for (int i = 0; i < students; i++) {
            int gender = sc.nextInt();
            int grade = sc.nextInt();

            int room = rooms[grade][gender];
            if (room == 0) {
                count++;
            } else if (rooms[grade][gender] >= max) {
                count++;
            }
            rooms[grade][gender]++;
        }
        System.out.println(count);
    }
}