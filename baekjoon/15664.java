import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main15664_N과M10 {
	static int N, M;
	static boolean[] visited;
	static int[] nums;
	static int[] p;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		p = new int[N];
		nums = new int[M];
		visited = new boolean[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			p[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(p);
		perm(0, 0);
		
		System.out.println(sb);
	}
	
	static void perm(int cnt, int start) {
		if(cnt == M) {
			for(int i = 0; i < M; i++) {
				sb.append(nums[i]).append(" ");
			}
			
			
			sb.append("\n");
			return;
		}
		
		// 중복을 제거하기 위해서 그 전에 저장했던 번호를 저장해두기
		int prev = 0;

		for(int i = start; i < N; i++) {
			if(visited[i]) continue;
			
			if(prev != p[i]) {
				visited[i] = true;
				nums[cnt] = p[i];
				prev = p[i];
				perm(cnt+1, i+1);
				visited[i] = false;
			}
		}
	}
}
