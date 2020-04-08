
public class WhileExample {

	public static void main(String[] args) {


		// 1~10 까지의 누적합을 구하는 로직.

		int n = 1; // 제어변수 : 반복문의 횟수를 제어할 변수 (begin)
		int total = 0; // 누적합을 담아줄 변수

		while(n <= 10) {// 논리형 조건식 : 반복문의 끝을 지정 (end)

			total += n;
			n++; // 증감식 : 반복문의 종료를 위해 제어변수의 값을 조정 (step)


		}

		System.out.println("1~10까지의 누적 합은 " + total);
	}
}
