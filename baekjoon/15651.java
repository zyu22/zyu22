import java.util.Scanner;

// 출력할때 StringBuilder를 사용하자... -> System.out.println() 은 시간초과뜸ㅠㅠ 
public class Main {
	static int N, M;
	static boolean[] visited;
	static int[] nums;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		visited = new boolean[N];
		nums = new int[M];
		
		perm(0);
		
		System.out.println(sb);
	}
	
	static void perm(int cnt) {
		if(cnt == M) {
			for(int i = 0; i < M; i++) {
				sb.append(nums[i] + " ");
			}
			sb.append("\n");
			
			return;
		}
		
		for(int i = 1; i <= N; i++) {
			nums[cnt] = i;
			perm(cnt+1);
		}
	}
}
