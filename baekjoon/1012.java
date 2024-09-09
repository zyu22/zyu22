import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main1012_유기농배추 {
	static int T;
	static int N, M, K;
	static int[][] map;
	static boolean[][] visited;
	static int[] dr = {-1, 0, 1, 0};
	static int[] dc = {0, 1, 0, -1};
	static class Bug {
		int r, c;

		public Bug(int r, int c) {
			super();
			this.r = r;
			this.c = c;
		}

		@Override
		public String toString() {
			return "Bug [r=" + r + ", c=" + c + "]";
		}
		
		
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			
			map = new int[M][N];
			visited = new boolean[M][N];
			
			for(int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine());
				
				int r = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				
				map[r][c] = 1;
			}
			//System.out.println(bug);
			
			int count = 0;
			for(int i = 0; i < M; i++) {
				for(int j = 0; j < N; j++) {
					
					if(map[i][j] == 1 && !visited[i][j]) {
						count++;
						bfs(i, j);
					}
				}
			}
			
			System.out.println(count);
		}
	}
	
	static void bfs(int r, int c) {
		//System.out.println(r + " " + c);
		Queue<Bug> que = new LinkedList<>();
		que.offer(new Bug(r, c));
		visited[r][c] = true;
		
		while(!que.isEmpty()) {
			Bug b = que.poll();
			
			for(int d = 0; d < 4; d++) {
				int nr = b.r+dr[d];
				int nc = b.c+dc[d];
				
				if(!check(nr, nc)) continue;
				if(visited[nr][nc] || map[nr][nc] == 0) continue;
				
				visited[nr][nc] = true;
				que.offer(new Bug(nr, nc));	
				map[nr][nc] = 2;
			}
		}
	}
	
	
	static boolean check(int r, int c) {
		return r >= 0 && r < M && c >= 0 && c < N;
	}
}
