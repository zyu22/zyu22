import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, K;
	static int[] map;
	static class Point {
		int now;
		int time;
		
		public Point(int now, int time) {
			super();
			this.now = now;
			this.time = time;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		map = new int[100001];
		int result = bfs(N);
		
		System.out.println(result);
	}
	
	static int bfs(int start) {	
		Queue<Integer> que = new LinkedList<>();
		que.offer(start);
		int time = 1;
		map[start] = time;
		
		
		while(!que.isEmpty()) {
			int now = que.poll();
			
			if(now == K) {
				
				return map[now]-1;
			}
			
			
			if(now-1 >= 0 && map[now-1] == 0) {
				map[now-1] = map[now]+1;
				que.offer(now-1);
			}
			
			if(now+1 <= 100000 && map[now+1] == 0) {
				map[now+1] = map[now]+1;
				que.offer(now+1);
			} 
			
			if(now*2 <= 100000 && map[now*2] == 0) {
				map[now*2] = map[now]+1;
				que.offer(now*2);
			}
		}
		
		return -1;
	}
}
