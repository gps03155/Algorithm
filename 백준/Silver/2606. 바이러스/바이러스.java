import java.util.Scanner;

public class Main {
    private static boolean[] visited;
    private static boolean[][] graph;
    private static int cnt = 0;

    public static void dfs(int num) {
        visited[num] = true;

        for (int i = 0; i < graph[num].length; i++) {
            // 방문X, 연결O
            if (!visited[i] && graph[num][i]) {
                visited[i] = true;
                dfs(i);
                cnt++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int computer = sc.nextInt();
        int pair = sc.nextInt();

        graph = new boolean[computer + 1][computer + 1];

        for (int i = 0; i < pair; i++) {
            int front = sc.nextInt();
            int back = sc.nextInt();

            graph[front][back] = true;
            graph[back][front] = true;
        }

        visited = new boolean[computer + 1];

        dfs(1);
        System.out.println(cnt);
    }
}