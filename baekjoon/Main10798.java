import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		char[][] chars = new char[5][16];
		
		int max = 0;
		int cnt = 0;
		for(int i = 0; i < 5; i++) {
			String s = br.readLine();
			cnt = s.length();
			max = Math.max(cnt, max);
			for(int j = 0; j < s.length(); j++) {
				chars[i][j] = s.charAt(j);
				
				
			}
		}

		for(int i = 0; i < max; i++) {
			for(int j = 0; j < 5; j++) {
				if(chars[j][i] == 0) continue;
				sb.append(chars[j][i]);
			}
		}
		
		System.out.println(sb);
		
	}
}
