import java.util.Arrays;
import java.util.Scanner;

public class Main15654_N과M5 {
	static int N, M;
	static int[] p;
	static int[] result;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		p = new int[N];
		result = new int[M];
		visited = new boolean[N];
		
		for(int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
		}

    // 정렬해줘야 순서대로 나옴
		Arrays.sort(p);
		
		combination(0);
	}
	
	
	static void combination(int cnt) {
		if(cnt == M) {
			for(int i = 0; i < M; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
			
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(visited[i]) continue;
			visited[i] = true;
			result[cnt] = p[i];
			combination(cnt+1);
			visited[i] = false;
		}
	}
}
