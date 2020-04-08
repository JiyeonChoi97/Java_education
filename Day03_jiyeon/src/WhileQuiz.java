import java.util.Scanner;

public class WhileQuiz {

	public static void main(String[] args) {

		/*
	 	- 정수를 2개(x,y)입력받아서 x부터 y까지의 누적합계를 while를 사용해서 구하는 코드를 작성하세요.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("정수 2개(x,y)를 입력하시오 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = 0;

		if(x>y) {
			int temp = x;
			x = y;
			y = temp;
		}
		int num1 = x;
		while(num1<=y) {
			sum +=num1;
			num1++;
		}
		System.out.println(x + "과 " + y + "누적 합계는 "+ sum + "입니다.");
	}

}
