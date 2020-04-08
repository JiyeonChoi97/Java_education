
public class WhileExample2 {

	public static void main(String[] args) {

		// 48 ~ 150 사이의 정수 중 8의 배수를 가로로 출력하기.

		int n = 48;

		while(n<=150) {

			if(n%8 == 0) {
				System.out.print(n + " ");
			}
			n++;

		}

		System.out.println(); // 단순 줄 개행

		int m = 48;
		while(m<=150) {

			System.out.print(m + " ");
			m += 8;
		}

		System.out.println(); // 단순 줄 개행
		
		//13 ~200까지의 정수 중 4의 배수이면서 8의 배수는 아닌 수만 가로로 출력해보세요.

		int x = 13;

		while(x <= 200) {
			if(x%4==0 & x%8!=0) {
				System.out.print(x + " ");
			}
			x++;
		}
		
		System.out.println();
		
		// 1~20000까지의 정수 중 248의 배수의 갯수를 출력
		
		int y = 1;
		int total1 = 0;
		
		while(y <=20000) {
			if(y % 248 ==0) {
				total1++;
			}
			y++;
		}
		System.out.println(total1);
		
		
		
		


	}

}
