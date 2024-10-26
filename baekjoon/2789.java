import java.util.Scanner;

public class Main2789_유학금지 {
	static char[] ch = {'C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E'};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String str = sc.next();
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			boolean flag = false;
			for(int j = 0; j < ch.length; j++) {
				if(c == ch[j]) {
					flag = true; 
					break;
				}
			}
			
			if(!flag) sb.append(c);
		}
		
		System.out.println(sb);
	}

}
