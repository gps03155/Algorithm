import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int p = sc.nextInt();
        int[] arr = new int[p + 2];
        arr[0] = 0;
        arr[arr.length - 1] = w;

        for (int i = 0; i < p; i++) {
            arr[i + 1] = sc.nextInt();
        }

        boolean[] rooms = new boolean[w + 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (!rooms[arr[i] - arr[j]]) {
                    rooms[arr[i] - arr[j]] = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i]) {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}