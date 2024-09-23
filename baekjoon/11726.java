import java.util.Scanner;

public class Main {
	static int[] tile;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		tile = new int[N+1];
		tile[0] = 1;
		tile[1] = 1;
		
		for(int i = 2; i <= N; i++) {
			tile[i] = (tile[i-1] + tile[i-2]) % 10007;
		}
		
		System.out.println(tile[N]);
	}
}
