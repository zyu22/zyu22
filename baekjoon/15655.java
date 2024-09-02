import java.util.Arrays;
import java.util.Scanner;

public class Main15655_N과M6 {
	static int N, M;
	static int[] p;
	static int[] result;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		p = new int[N];
		visited = new boolean[N];
		result = new int[M];
		
		for(int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
		}
		
		Arrays.sort(p);
		combi(0, 0);
		
	}
	
	static void combi(int cnt, int start) {
		if(cnt == M) {
			for(int i = 0; i < M; i++) {
				
				System.out.print(result[i] + " ");
				
			}
			
			System.out.println();
			
			return;
		}
		
		for(int i = start; i < N; i++) {
			if(visited[i]) continue;
			visited[i] = true;
			result[cnt] = p[i];
			combi(cnt+1, i+1);
			visited[i] = false;
		}
	}
}
