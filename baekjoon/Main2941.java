import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		// 횟수 세는 변수
		int cnt = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(c == '=' || c == '-') {
				if(i-2 >= 0 && s.charAt(i-1) == 'z' && s.charAt(i-2) == 'd') {
					cnt--;
					continue;
				} else {
					continue;
				}
			} else if(c == 'j' && i-1 >= 0) {
				char cc = s.charAt(i-1);
				
				if(cc == 'n' || cc == 'l') {
					continue;
				} else {
					cnt++;
				}
			} else {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
