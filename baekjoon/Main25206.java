import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	static Map<String, Double> eduAvg = new HashMap<>();

  // 학점값을 찾기 위해 map을 사용 
	static {
		eduAvg.put("A+", 4.5);
		eduAvg.put("A0", 4.0);
		eduAvg.put("B+", 3.5);
		eduAvg.put("B0", 3.0);
		eduAvg.put("C+", 2.5);
		eduAvg.put("C0", 2.0);
		eduAvg.put("D+", 1.5);
		eduAvg.put("D0", 1.0);
		eduAvg.put("F", 0.0);
		eduAvg.put("P", 5.0);
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		double sum = 0.0;
		double eduSum = 0.0;

    // 입력값 없을때까지 돌리기
		while((s = br.readLine()) != null && !s.isEmpty()) {
			StringTokenizer st = new StringTokenizer(s);

			String subject = st.nextToken();	// 과목명
			double avg = Double.parseDouble(st.nextToken());	// 학점
			double credit = eduAvg.get(st.nextToken());	// 등급
			
			if(credit == 5.0) {
				continue;
			}

      // 학점 총합으로 나눠야하니까 더해주기
			eduSum += avg;
			sum += avg * credit;
		}
		
		sum /= eduSum;
		System.out.println(sum);
		
	}
}
