import java.util.Scanner;

public class FigureCircle extends Figure {
	
	FigureCircle() {
		this.name = "�� ���� ���ϱ�";
	}
	
	double r = 0;
	double circleArea = 0;

	public void inputValue() {

		Scanner s = new Scanner(System.in);

		System.out.println("���� �������� �Է����ּ���! (cm)");
		this.r = s.nextDouble();

		this.circleArea = Math.PI * Math.pow(this.r, 2);


	}
	public void printResult() {
		System.out.println("���� ���̴� : " + this.circleArea);
	}

}
