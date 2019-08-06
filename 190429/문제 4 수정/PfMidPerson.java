import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
	public static int currentNum = 0;

	private String name = "";
	private int startNum = 0;
	private int endNum = 0;
	private String castedNum = "";
	private String clap = "";
	private boolean endGame = false;

	public Person(String name, int startNum, int endNum) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.startNum = startNum;
		this.endNum = endNum;
		this.currentNum = this.startNum;
	}
	
	public void count() {
		this.castingTostr();
		this.setClap();
		this.shout();
		this.checkEnd();
		this.currentNum++;
	}

	//숫자를 문자열로 변환
	private void castingTostr() {
		this.castedNum = String.valueOf(currentNum);
	}
	
	//현재 숫자가 앤드숫자와 같거나 크면 endGame을 트루로 변경
	private void checkEnd() {
		if(this.currentNum >= this.endNum) {
			this.endGame = true;
		}
	}
	
	//박수 세팅
	private void setClap() {
		int count = 0;
		this.clap = "";
		Matcher match = Pattern.compile("(3|6|9)").matcher(this.castedNum);
		for (int i = 0; i < 99999; i++) {
			if (match.find()) {
				this.clap = this.clap + "짝";
				count++;
			} else {
				break;
			}
		}
		
		if(count == 0)
			this.clap = String.valueOf(currentNum);
	}
	
	//프린트
	public void shout() {
		System.out.println(name + "이(가) 외칩니다!! " + this.clap);
	}
	
	public boolean getEnd() {
		return this.endGame;
	}
}
