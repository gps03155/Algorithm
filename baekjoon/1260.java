import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
	static int[] visited = new int[1001];
	
	public static void dfs(int[][] graph, int node, int row) {
		System.out.print(node + " ");
		visited[node] = 1;
		
		for(int i=1; i<=row; i++) {
			if(visited[i] == 0 && graph[node][i] == 1) {
				dfs(graph, i, row);
			}
		}
	}
	
	public static void bfs(int[][] graph, int node, int row) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(node);
		visited[node] = 1;
		
		while(!queue.isEmpty()) {
			node = queue.poll();
			System.out.print(node + " ");
			
			for(int i=1; i<=row; i++) {
				if(visited[i] == 0 && graph[node][i] == 1) {
					queue.offer(i);
					visited[i] = 1;
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int startNode = Integer.parseInt(st.nextToken());
		
		int[][] graph = new int[n+1][n+1];
		
		for(int j=0; j<m; j++) {
			st = new StringTokenizer(br.readLine());
			int node1 = Integer.parseInt(st.nextToken());	
			int node2 = Integer.parseInt(st.nextToken());
			
			graph[node1][node2] = 1;
			graph[node2][node1] = 1;
		}
		
		dfs(graph, startNode, n);
		System.out.println();
		Arrays.fill(visited, 0);
		bfs(graph, startNode, n);
	}
}
