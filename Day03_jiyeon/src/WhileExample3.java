import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {

		/*
		 - 정수를 1개 입력바다아서 해당 정수가 소수(prime number)인지의 여부를 판단하는 로직. 
		 */


		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");

		int num = sc.nextInt();
		int n=1;
		int total = 0;
		while(n<=num) {
			if(num%n==0) {
				total++;
			}
			n++;
		}
		if(total == 2) {
			System.out.println("소수입니다.");
		}
		else {
			System.out.println("소수가 아닙니다.");
		}

		System.out.println("=================================");

		int j = 2;
		while(num % j != 0) {
			j++;
		}
		if(num ==j) {
			System.out.println("소수입니다.");
		}
		else {
			System.out.println("소수가 아닙니다.");
		}



	}

}
