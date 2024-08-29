import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution4008_숫자만들기 {
	static int N, T;
	static int[] nums;
	static int max;
	static int min;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			N = Integer.parseInt(br.readLine());
			nums = new int[N];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int p = Integer.parseInt(st.nextToken());
			int i = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			
			
			for(int n = 0; n < N; n++) {
				nums[n] = Integer.parseInt(st.nextToken());
			}
			
			max = -1000000;
			min = 100000;
			
			
			// 처음 값은 더하는 값이어야 되니까 sum의 초기화값으로 줌
			// 0번 인덱스 : sum + 1번 인덱스 하기
			cal(1, p, i, m, d, nums[0]);
			
			System.out.println("#" + t + " " + (max-min));
			
		}
		
	}
	
	// p : + / i : - / m : * / d : /
	static void cal(int cnt, int p, int i, int m, int d, int sum) {
		if(cnt == N) {
			if(min > sum) {
				min = Math.min(min, sum);
			}
			
			if(max < sum) {
				max = Math.max(max, sum);
			}
			
			return;
		}
		
		
		if(p > 0) {
			
			cal(cnt+1, p-1, i, m, d, sum + nums[cnt]);
		} 
		
		if(i > 0) {
			cal(cnt+1, p, i-1, m, d, sum - nums[cnt]);
		} 
		
		if(m > 0) {
			cal(cnt+1, p, i, m-1, d, sum * nums[cnt]);
		} 
		
		if(d > 0) {
			cal(cnt+1, p, i, m, d-1, sum / nums[cnt]);
		}
	}
}
