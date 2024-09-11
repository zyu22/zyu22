import java.util.ArrayList;
import java.util.Scanner;

// 연결된 것들의 집합체? 가 몇개인지 찾는 문제
// 인접리스트로 연결된 것들을 모아주고, 방문함수(visited)로 방문 했을때는 굳이 안가도 되는걸로 체크
public class Main11724_연결요소의개수 {
	static int N, M;
	static ArrayList<Integer>[] list;	// 인접리스트
	static boolean[] visited;
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		
		count = 0;
		visited = new boolean[N+1];
		list = new ArrayList[N+1];
		
		for(int i = 1; i < N+1; i++) {
			list[i] = new ArrayList<>();
		}
		
		// 무향그래프 - > 서로 연결 해주기
		for(int i = 0; i < M; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			
			list[s].add(e);
			list[e].add(s);
		}
		
		
		// 방문 안한것만 dfs로 돌린다음 카운트세기
		for(int i = 1; i < N+1; i++) {
			if(visited[i]) continue;
			
			dfs(i);
			count++;
		}
		
		System.out.println(count);
		
	}
	
	static void dfs(int idx) {
		visited[idx] = true;
		for(int go: list[idx]) {
			if(!visited[go]) {
				dfs(go);
			}
		}
	}
}
