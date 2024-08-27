import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int N;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		N = Integer.parseInt(br.readLine());
		
		
		int cnt = 0;
		
		for(int i = 0; i < N; i++) {
			String s = br.readLine();
			
			int[] alpa = new int[123];	// 아스키코드를 사용하기 위해서 최대값인 122+1
			boolean flag = true;		// 그룹단어 여부 확인
			for(int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				if(alpa[c] != 0 && s.charAt(j-1) != c) {
					flag = false;
					break;
				} else {
					alpa[c]++;
				}
			}
			
			if(flag) cnt++;
		}
		
		System.out.println(cnt);
	}
}
