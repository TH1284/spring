import java.util.Arrays;
import java.util.List;

public class RunClass {
	public static void main(String[] args) {
		String[] names = {"철수", "영희", "짱구", "유리", "길동", "꺽정", "둘리", "뽀로로", "보고", "유신"};
		Student[] student = new Student[names.length];
		
		for (int i = 0; i < names.length; i++) {
			student[i] = new Student(names[i]);
		}
		List<Student> list = Arrays.asList(student);
		for (int i = 0; i < student.length; i++) {
			if (student[i].middleScore < student[i].finalScore) {
				System.out.println(student[i]);
			}
		}
	}
}
