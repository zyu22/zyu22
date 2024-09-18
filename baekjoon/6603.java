import java.util.Scanner;

public class Main {
	static int K;
	static int[] p;
	static boolean[] visited;
	static StringBuilder sb;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int k = sc.nextInt();
			if(k == 0) return;
			
			sb = new StringBuilder();
			K = k;
			p = new int[K];
			visited = new boolean[K];
			
			for(int i = 0; i < K; i++) {
				p[i] = sc.nextInt();
			}
			
			perm(0, 0);
			System.out.println(sb);
      // System.out.println 을 한번 더 쓰면 안된다..
		}
	}
	
	static void perm(int cnt, int start) {
		if(cnt == 6) {
			for(int i = 0; i < K; i++) {
				if(visited[i]) {
					sb.append(p[i]).append(" ");
				}
			}
			sb.append("\n");
			
			return;
		}
		
		
		for(int i = start; i < K; i++) {
			visited[i] = true;
			perm(cnt+1, i+1);
			visited[i] = false;
		}
		
	}
}
