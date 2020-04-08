package Overloading;


public class Calculator {

	/*
	 # 오버로딩 : 하나의 클래스 내부에서 같은 이름을 가진 메서드나 생성자를 여러개 선언할 수 있게 해주는 문법.
	 
	 - 오버로딩의 적용 조건
	 1. 매개변수의 데이터 타입이 다를 것 or
	 2. 매개변수의 전달 순서가 다를 것 or
	 3. 매개 변수의 갯수가 다를 것.
	 */
	void calcRectArea(int n) {
		System.out.println("정사각형의 넓이는 : " + n*n);
	} 
	
	void calcRectArea(int a, int b) {
		System.out.println("직사각형의 넓이는 : " + a*b);
	}
	
	void inputData() {}
	
	void inputData(int a) {}
	
	void inputData(int a, int b) {}
	
	void inputData(String s) {}

	void inputData(int a, double b) {}
	
	void inputData(double d, int a) {}
	
//	void inputData(int numer) {} (x) 정수 매값을 받는 메서드가 이미 선언되어있기 때문에
	
//	void inputData(int a) {		(x) 리턴 타입은 중복 선언에 영향을 미치지 않습니다.
//		return 0;
//	}
	
	
	
	
	
	
	
	
	
}
