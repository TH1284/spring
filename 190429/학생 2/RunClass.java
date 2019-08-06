import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class RunClass {
	public static void main(String[] args) {
		String[] names = { "철수", "영희", "짱구", "유리", "길동", "꺽정", "둘리", "뽀로로", "보고", "유신" };
		ArrayList<Student> student = new ArrayList<Student>();

		for (int i = 0; i < names.length; i++) {
			student.add(new Student(names[i]));
		}
		student.forEach(new Consumer<Student>() {
			@Override
			public void accept(Student t) {
				if (t.middleScore < t.finalScore) {
					System.out.println(t);
				}
			}
		});
	}
}
