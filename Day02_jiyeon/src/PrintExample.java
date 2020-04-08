
public class PrintExample {

	public static void main(String[] args) {

		// 자바의 표준 출력 형식은 크게 3가지입니다. 
		// 개행을 포함하지 않는 print()
		System.out.print("안녕하세요~");
		System.out.println("hello~");
		System.out.print("안녕히가세요~");
		System.out.println("bye~");
		
		// println()은 자동 개행을 포함해 줍니다.
		

		// 형식 지정 표준 출력 함수 printf()
		/*
		 %d = 부호가 있는 10진수 정수 데이터
		 %f = 실수 데이터
		 %s = 문자열 데이터 (String)
		 %% = 특수문자 %
		 \n = 줄 개행 (enter)
		 \t = 탭 정렬 (tab)					
		  */
		
		int month = 12;
		int day = 25;
		String anni = "크리스마스";
		//12월 25일은 크리스마스입니다. 
		System.out.println(month + "월 " + day + "일은 " + anni + "입니다.");
		System.out.printf("%d월\t%d일은 \t%s입니다.\n\n\n", month, day, anni);
		System.out.printf("%d월 %d일은 %s입니다.\n", 10, 20, "일요일");
		
		System.out.println("===================================");
		
		/*
		 - %f는 기본적으로 소수점 6자리까지 표현하도록 설정되어 있습니다. 
		 - 만약 자리수를 조절하려면 %.[자리수에 해당하는 숫자]f를 사용합니다. 
		 */
		
		double rate = 63.456;
		System.out.printf("시험 합격율 : %.2f%%", rate);
		
		
		
		
		
		
		
		
		
		
		
	}

}
