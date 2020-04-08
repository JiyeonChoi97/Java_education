import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {

		for(int i = 1; i <= 10; i++) {
			if(i == 5) continue;
			System.out.print(i + " ");
		}
		System.out.println("\n반복문 종료");

		// continue 키워드를 사용하여 1~30 까지의 정수 중 홀수만 가로로 출력해 보세요.

		for(int i = 1; i <= 30; i++) {
			if(i % 2 == 0) continue;
			System.out.print(i + " ");
		}

		System.out.println();

		System.out.println("========================");

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("정수를 입력하세요 : ");
			int num = sc.nextInt();

			if(num ==1) break;
			else if(num == 0) {
				System.out.println("다른 정수를 입력해 주세요");
				continue; 
			}

			System.out.println(10 / num);
		}

	}

}
