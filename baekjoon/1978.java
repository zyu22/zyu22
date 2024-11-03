import java.util.Scanner;

public class Main1978_소수찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int count = 0;
		for(int i = 0; i < N; i++) {
	
			int num = sc.nextInt();
			
			boolean flag = true; // 소수인가요
			
			if(num == 1) continue;
			
			for(int j = 2; j < num; j++) {
				if(num % j == 0) {
					flag = false;	// 소수가 아니다! -> false
					break;
				}
			}
			
			if(flag) count++;	// 소수일 때 값 1 증가
		}
		
		System.out.println(count);

	}
}
