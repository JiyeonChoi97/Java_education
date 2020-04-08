
public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 # 3항 연산자
		 - 피 연산자(연산을 당하는 값)가 3개인 연산자.
		 - (조건식 ? 좌항 : 우항)
		 - 논리형 조건식을 비교하여 참일때 좌항, 거짓일 때 우항의 결과값이 도출됩니다.
		 */
		String result = (5 == 4 ? "참입니다." : "거짓이에요.");
		System.out.println(result);
		
		System.out.println("============================");
		
		/*
		 # 난수값을 발생시키는 메소드 Math.random()
		 - 0.0이상 1.0미만의 실수 난수를 반환 (double)
		 */
		
//		double rn = Math.random();
//		System.out.println(rn);
		
		//1~10까지의 정수 난수를 발생시키고 싶어요~
		
		int rn = (int) ((Math.random()*10) + 1);
		
		//10 ~ 100 까지의 정수 난수
		
		int rn2 = (int) ((Math.random() * 91) + 10);
		
		// 23 ~ 142 까지의 정수 난수
		int rn3 = (int) (Math.random() *120 + 23);


		
		
		
		
		
		
		
		
	}

}
