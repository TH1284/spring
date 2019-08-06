import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Person 클래스를 사용합니다
public class MidTerm4 {
	public static void main(String[] args) {

		Person[] p = new Person[4];
		p[0] = new Person("짱구", 1, 110);
		p[1] = new Person("철수", 1, 110);
		p[2] = new Person("유리", 1, 110);
		p[3] = new Person("재원", 1, 110);
		System.out.println("3,6,9 게임 시작~~~~~");

		for (int i = 0; i < 999999; i++) {
			p[i % p.length].count();
			if  (p[i % p.length].getEnd()) {
				break;
			}
		}
		
		System.out.println("게임이 끝났습니다~~~");

//		String test = "7005550300";
//		Matcher match = Pattern.compile("(3|6|9)").matcher(test);
//		int matchCount = 0;
//		for (int i = 0; i < 99999; i++) {
//			if (match.find()) {
//				System.out.println(match.group());
//				matchCount++;
//			} else {
//				break;
//			}
//		}
//		System.out.println("총 매치 개수 : " + matchCount);
//		
//		
		
	}
}
