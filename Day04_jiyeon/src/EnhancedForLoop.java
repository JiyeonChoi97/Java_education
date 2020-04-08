
public class EnhancedForLoop {

	public static void main(String[] args) {

		String[] week = {"월", "화", "수", "목", "금", "토", "일"};

		//		for(int idx = 0; idx<week.length; idx++) {
		//			System.out.println(week[idx] + "요일");
		//		}
		//	

		for(String day : week) {
			System.out.println(day + "요일");
		}

		System.out.println("==============================");

		/*
		 1. scores란 int 배열에 정수 데이터를 저장하세요.
		 ex) [98, 71, 85, 66, 100, 95]
		 2. 향상된 for문을 사용하여 총점과 평균을 출력하세요.
		 3. 평균은 double 타입입니다. 소수점 둘째자리까지 출력하세요.
		 */

		int score[] = {98, 71, 85, 66, 100, 95};

		int sum = 0;
		double aver  = 0;
		for(int a : score) {
			sum = sum + a;
		}
		aver = (double)sum / score.length;
		System.out.printf("총점 : %d점\n평균 : %.2f점", sum ,  aver);

		
	}

}
