import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1929_소수구하기 {
    static int M, N;
    static boolean[] nums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        // true : 소수 x, false : 소수 o
        nums = new boolean[N+1];
        nums[0] = true;
        nums[1] = true;

        for(int i = 2; i <= N; i++) {
            if(nums[i]) continue;
            for(int j = i+i; j <= N; j+=i) {
                nums[j] = true;
            }
        }


        for(int i = M; i <= N; i++) {
            if(!nums[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
