import java.util.Scanner;

public class LoopNesting2 {

	public static void main(String[] args) {


		/*
		 - 정수를 하나 입력받아서,  1부터 해당 정수까지의 모든 소수를 판별하여 가로로 출력 후 
		 	소수들의 누적합을 도출해 내야 합니다. 

		 	ex)
		 	입력한 정수 : 12 -> 2, 3, 5, 7, 11
		 	모든 소수의 누적합 : 28
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;
		System.out.print("입력한 정수 : " + num + " -> ");
		for(int j =1 ; j <= num; j++) {	
			int count = 0;
			for(int i = 1; i <= j; i++) {
				if(j % i ==0) {
					count++;
				}
			}
			if(count ==2) {
				System.out.print(j + ", ");
				sum += j;
			}
		}
		System.out.println();
		System.out.println("모든 소수의 누적합 : " + sum);



	}

}
