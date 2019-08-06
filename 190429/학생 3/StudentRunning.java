import java.util.HashMap;
import java.util.Map;

public class StudentRunning {
	public static void main(String[] args) {
		String[] names = { "철수", "영희", "짱구", "유리", "길동", "꺽정", "둘리", "뽀로로", "보고", "유신" };
		HashMap<String, Student> map = new HashMap<String, Student>();


		
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], new Student(names[i]));
		}
		
		
		
		for (Map.Entry<String, Student> item : map.entrySet()) {
			Student one = item.getValue();
			if (one.middleScore < one.finalScore) {
				System.out.println(one);
			}
		}
	}
}
