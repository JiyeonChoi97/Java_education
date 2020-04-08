
public class CastingExample1 {

	public static void main(String[] args) {

		
		/*
		 - 크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변환할 때는 자바 가상머신(JVM)이 자동으로 타입을 올려서 변환해 줍니다.
		 	(promotion, Upcasting)
		 */
		
		byte b = 10;
		int i = b;
		
		System.out.println(b);
		
		char c = '가';
		int j = c;
		
		System.out.println("가의 유니코드 번호 : " + j);
		
		int k = 500;
		double d = k;
		System.out.println(d);
		
	}

}
