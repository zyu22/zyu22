import java.util.Scanner;

public class Main15652_N과M4 {
	static int N, M;
	static int[] p;
	static int[] result;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();

		p = new int[N];
		result = new int[M];
		
		for(int i = 0; i < N; i++) {
			p[i] = i+1;
		}
		
		perm(0, 0);
		
		
	}
	
	static void perm(int cnt, int start) {
		if(cnt == M) {
			for(int i = 0; i < M; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = start; i < N; i++) {
			result[cnt] = p[i];
			perm(cnt+1, i);
		}
	}
}
