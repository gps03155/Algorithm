import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<Integer>[] list;
    static int[] depthVisited;
    static int[] countVisited;
    static int count = 1;

    public static void dfs(int x, int depth) {
        depthVisited[x] = depth;
        countVisited[x] = count;

        for (Integer i : list[x]) {
            if (depthVisited[i] == -1) {
                count++;
                dfs(i, depth + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        list = new ArrayList[n + 1];
        countVisited = new int[n + 1];
        depthVisited = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            list[i] = new ArrayList<>();
            depthVisited[i] = -1;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list[x].add(y);
            list[y].add(x);
        }

        for (int i = 0; i < n + 1; i++) {
            Collections.sort(list[i]);
        }

        dfs(r, 0);

        long answer = 0;
        for (int i = 1; i < n + 1; i++) {
            answer += (long) depthVisited[i] * countVisited[i];
        }
        System.out.println(answer);
    }
}