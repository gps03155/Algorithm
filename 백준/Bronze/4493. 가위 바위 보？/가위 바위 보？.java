import java.util.Scanner;

public class Main {
    public static int[] calcurate(int[] players, String a, String b) {
        if (a.equals(b)) {
            players[0]++;
            players[1]++;
        } else if (a.equals("P") && b.equals("R")) {
            players[0]++;
        } else if (a.equals("R") && b.equals("S")) {
            players[0]++;
        } else if (a.equals("S") && b.equals("P")) {
            players[0]++;
        } else {
            players[1]++;
        }

        return players;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] players = {0, 0};

            for (int j = 0; j < n; j++) {
                calcurate(players, sc.next(), sc.next());
            }

            System.out.println(players[0] > players[1] ? "Player 1" : players[0] == players[1] ? "TIE" : "Player 2");
        }
    }
}