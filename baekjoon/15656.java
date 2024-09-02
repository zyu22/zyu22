import java.util.Arrays;
import java.util.Scanner;

public class Main15656_N과M7 {
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
		
		perm(0);
		
		System.out.println(sb);
	}
	
	// sysout 쓰면 시간초과뜸
	static void perm(int cnt) {
		if(cnt == M) {
			for(int i = 0; i < M; i++) {
				sb.append(result[i] + " ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 0; i < N; i++) {
			result[cnt] = p[i];
			perm(cnt+1);
		}
	}
}
