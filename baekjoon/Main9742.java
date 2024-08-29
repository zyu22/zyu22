import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main9742_순열 {
	static int N, R, count;
	static char[] p;	
	static char[] pResult;
	static boolean[] visited; // 방문 
	static String result;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		// 입력값 없을때까지 돌리기 -> str.isEmpty 꼭 써야함.. 없으면 틀렸습니다 나옴ㅠㅠ
		while((str = br.readLine()) != null && !str.isEmpty()) {
			StringTokenizer st = new StringTokenizer(str);
			if(!st.hasMoreTokens()) return;
			String s = st.nextToken();
			N = s.length();

			R = Integer.parseInt(st.nextToken());
			
			
			p = new char[N];
			pResult = new char[N];
			visited = new boolean[N];
			count = 0;
			result = "";
			
			
			for(int i = 0; i < N; i++) {
				p[i] = s.charAt(i);
			}
			
			perm(0);
			
			
			if(count < R) result = "No permutation";
			System.out.println(s + " " + R + " = " + result);
		}
	}
	
	
	static void perm(int cnt) {
		if(count == R) return;
		
		if(cnt == N) {
			count++;
			
			// 입력에서 받은 index랑 맞으면 String으로 변경해서 할당하기
			if(count == R) {
				result = new String(pResult);
			}
			
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(visited[i]) continue;
			visited[i] = true;
			pResult[cnt] = p[i];
			perm(cnt+1);
			visited[i] = false;
		}
	}
}
