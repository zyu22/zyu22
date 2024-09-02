import java.util.Arrays;
import java.util.Scanner;

public class Main15657_N과M8 {
	static int N, M;
	static int[] p;
	static int[] result;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		p = new int[N];
		result = new int[M];
		
		for(int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
		}
		
		Arrays.sort(p);
		
		perm(0, 0);
		
		System.out.println(sb);
	}
	
	static void perm(int cnt, int start) {
		if(cnt == M) {
			for(int i = 0; i < M; i++) {
				sb.append(result[i] + " ");
			}
			sb.append("\n");
			return;
		}
		
		
		for(int i = start; i < N; i++) {
			result[cnt] = p[i];
			perm(cnt+1, i);
		}
	}
}
