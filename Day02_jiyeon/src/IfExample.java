import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.print("시험 점수를 입력하세요 : ");
		int point = sc.nextInt();
		
		if(point >= 70) {
			System.out.println("70점 이상입니다.");
			System.out.println("시험에 합격했습니다!");
		}
		else {
			System.out.println("70점 미만입니다.");
			System.out.println("시험에 불합격했습니다!");
		}












	}

}
