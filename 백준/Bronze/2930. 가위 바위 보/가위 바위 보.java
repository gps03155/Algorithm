import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int score(char sang, char friend) {
        if (sang == 'S') {
            if (friend == 'P') return 2;
            if (friend == 'S') return 1;
            if (friend == 'R') return 0;
        }
        if (sang == 'P') {
            if (friend == 'R') return 2;
            if (friend == 'P') return 1;
            if (friend == 'S') return 0;
        }
        if (sang == 'R') {
            if (friend == 'S') return 2;
            if (friend == 'R') return 1;
            if (friend == 'P') return 0;
        }

        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine());
        char[] sangs = br.readLine().toCharArray();

        int friends = Integer.parseInt(br.readLine());
        char[][] rounds = new char[friends][r];
        for (int i = 0; i < friends; i++) {
            rounds[i] = br.readLine().toCharArray();
        }

        int score = 0, max = 0;
        for (int i = 0; i < r; i++) {
            int[] maxs = new int[3];

            for (int j = 0; j < friends; j++) {
                score += score(sangs[i], rounds[j][i]);
                maxs[0] += score('S', rounds[j][i]);
                maxs[1] += score('P', rounds[j][i]);
                maxs[2] += score('R', rounds[j][i]);
            }
            max += Math.max(maxs[0], Math.max(maxs[1], maxs[2]));
        }

        System.out.println(score);
        System.out.println(max);
    }
}