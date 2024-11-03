import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// a제곱 + b제곱 = c제곱 (피타고라스의 정리)
// a, b, c 중 뭐가 젤 큰수인지는 정확하지 않음 => 정렬 시켜서 젤 큰수가 끝으로
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int[] nums = new int[3];
			for(int i = 0; i < 3; i++) {
				nums[i] = Integer.parseInt(st.nextToken());
			}
			
			if(nums[0] == 0 && nums[1] == 0 && nums[2] == 0) break;
			
			Arrays.sort(nums);
			
			int a = (int) Math.pow(nums[0], 2);
			int b = (int) Math.pow(nums[1], 2);
			int c = (int) Math.pow(nums[2], 2);
			
			if(a + b == c) {
				sb.append("right");
			} else {
				sb.append("wrong");
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}
}
