import java.util.Scanner;

// 병합정렬 -> 최근에 배워서 써보고 싶었음..ㅎㅎ
// syso 쓰면 시간초과..
public class Main2751_수정렬하기2 {
	static int N;
	static int[] arr;
	static int[] tmp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		N = sc.nextInt();
		arr = new int[N];
		tmp = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		mergeSort(0, N-1);
		
		for(int i = 0; i < N; i++) {
			sb.append(arr[i] + "\n");
		}
		
		System.out.println(sb);
	}	
	
	static void mergeSort(int left, int right) {
		if(left < right) {
			int mid = (left + right) / 2;
			mergeSort(left, mid);
			mergeSort(mid+1, right);
			merge(left, mid, right);
		}
	}
	
	static void merge(int left, int mid, int right) {
		int L = left;
		int R = mid+1;
		
		int idx = left;
		
		while(L <= mid && R <= right) {
			if(arr[L] <= arr[R]) {
				tmp[idx++] = arr[L++];
			} else {
				tmp[idx++] = arr[R++];
			}
		}
		
		if(L <= mid) {
			for(int i = L; i <= mid; i++) {
				tmp[idx++] = arr[i];
			}
		} else {
			for(int i = R; i <= right; i++) {
				tmp[idx++ ] = arr[i];
			}
		}
		
		for(int i = left; i <= right; i++) {
			arr[i] = tmp[i];
		}
	}
}
