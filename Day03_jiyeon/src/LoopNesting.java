import java.util.Scanner;

public class LoopNesting {

	public static void main(String[] args) {

		/*
		 # 구구단 출력 

		 - 구구단 단수는 스캐너르 통해 입력받으세요.
		 - 해당하는 단의 구구단을 1~9행까지 출력하세요.

		 ex) "구구단을 입력하세요 : 4"

		 "*** 구구단 4단 ***"

		 4 X 1 = 4
		 4 X 2 = 8
		 .
		 .
		 .
		 4 X 9 = 36
		 */

//		Scanner sc = new Scanner(System.in);
//		System.out.print("구구단을 입력하세요 : ");
//		int num = sc.nextInt();

	
		for (int j = 1; j <= 9; j++) {
			System.out.println("*** 구구단 " + j + "단 ***");
			for(int i = 1; i<=9; i++) {
				System.out.println(j + " X " + i + " = " + j*i);

			}
			System.out.println();
		}




	}

}
