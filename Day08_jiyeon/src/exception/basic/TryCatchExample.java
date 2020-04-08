package exception.basic;

public class TryCatchExample {

	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 0;

		System.out.println("나눗셈 시작!");

		try {
			//try 블록 내에는 예외 발생 가능성이 있는 코드를 작성합니다. 

			int result = n1 / n2;
			System.out.printf("%d / %d = %d\n", n1, n2, result);
		} catch(ArithmeticException e) {
			// catch블록에는 try에서 예외가 발생했을 시 예외를 처리하는 출력문이나 동작을 지정합니다. 
			System.out.println("0으로 나누지 마세요!");
		}
		System.out.println("프로그램 정상 종료!");



	}

}
