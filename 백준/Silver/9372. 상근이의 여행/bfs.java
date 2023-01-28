import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static boolean[] visited;
    private static Queue<Integer> queue;

    private static LinkedList<Integer> flights[];

    public static int bfs(int n) {
        visited[n] = true;
        queue.add(n);
        int cnt = 0;

        while (queue.size() > 0) {
            n = queue.poll();
            Iterator<Integer> it = flights[n].listIterator();

            while (it.hasNext()) {
                int i = it.next();

                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            flights = new LinkedList[n + 1];
            for (int j = 0; j < n + 1; j++) {
                flights[j] = new LinkedList<>();
            }

            for (int j = 0; j < m; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                flights[a].add(b);
                flights[b].add(a);
            }

            visited = new boolean[n + 1];
            queue = new LinkedList<>();
            System.out.println(bfs(1));
        }
    }
}
