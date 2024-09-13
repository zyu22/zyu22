import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main15665_N과M11 {
	static int N, M;
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
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			p[i] = Integer.parseInt(st.nextToken());
		}
	
		Arrays.sort(p);
		perm(0);
		
		System.out.println(sb);
	}
	
	static void perm(int cnt) {
		if(cnt == M) {
			for(int i = 0; i < M; i++) {
				sb.append(nums[i]).append(" ");
			}
			
			sb.append("\n");
			
			return;
		}
		
		
		int prev = 0;
		for(int i = 0; i < N; i++) {
			
			if(prev != p[i]) {
				nums[cnt] = p[i];
				prev = p[i];
				perm(cnt+1);
			}
		}
	}
}
