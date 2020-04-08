import java.util.Scanner;

public class BreakQuiz {

	public static void main(String[] args) {


		/*
		 1. 두 수의 더하기를 맞추는 문제를 지속적으로 출제하는 프로그램이비낟. 
		 2. 2가지의 정수를 1~100 사이의 난수를 발생시켜서 지속적으로 문제를 출제한 후 사용자가 0을 입력하면 반복문을 탈출시키세요.
		 3. 종료 이후 정답 횟수와 오답 횟수를 각각 출력하세요.

		 */
		Scanner sc = new Scanner(System.in);  

		System.out.println("덧셈 연산 문제입니다. \n그만 하시려면 0을 입력하세요.");

		int correct = 0;
		int wrong = 0;		

		while(true) {
			int check = (int) (Math.random() * 2); 
			int num1 = (int) (Math.random() * 100 +1);
			int num2 = (int) (Math.random() * 100 +1);
			int num3 = 0;

			if(check == 0) {
				System.out.println(num1 + " + " + num2 + " = ???");
				num3 = num1 + num2;}	
			else{
				System.out.println(num1 + " - " + num2 + " = ???");
				num3 = num1 - num2;}

			int answer = sc.nextInt();
			if(answer == 0) break;
			else if(answer == num3) {
				System.out.println("정답입니다.!");
				correct++;
			}
			else {
				System.out.println("오답입니다.");
				wrong++;
			}
		}
		System.out.println("입력종료");
		System.out.println("==============================");
		System.out.println("정답 횟수 : " + correct);
		System.out.println("오답 횟수 : " + wrong);





	}
}