
public class CastingExample3 {

	public static void main(String[] args) {

		char c = 'B';
		int i = 2;
		
		int intResult = c + i;
		char charResult = (char) (c + i);
		
		// 타입이 다른 기본 데이터의 연산 시에는 데이터 타입이 큰 쪽에 맞춰져서 자동으로 형 변환된 뒤 연산을 진행합니다. 
		
		int k = 10;
		double d =  k / 4;
		double d2 =  (double)k / 4;
		System.out.println(d);
		System.out.println(d2);
		
		
		//int 보다 작은 크기의 데이터 연산으로 자동으로 결과값이 int로 변환되어 처리됩니다. (데이터 손실의 방지, 오버플로우 방지)
		byte b1 = 100;
		byte b2 = 70;
		System.out.println(b1 + b2);
		
				
	}

}
