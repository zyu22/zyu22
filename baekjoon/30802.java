import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main30802_웰컴키트 {
	static int N, T, P;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		
		int[] size = new int[6];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 6; i++) {
			size[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		T = Integer.parseInt(st.nextToken());
		P = Integer.parseInt(st.nextToken());
		
		int sizeCount = 0;
		for(int i = 0; i < size.length; i++) {
			sizeCount += size[i] / T;
			// T가 1개일때는 size[i]/T가 끝
			// T 가 0이면 아예 주문안되는거
			if(size[i] != 0 && T != 1 && size[i] % T != 0) {
				sizeCount++;
			}
		}
		
		sb.append(sizeCount + "\n");
		sb.append(N / P + " " + N % P);
		
		
		System.out.println(sb);
	}
}
