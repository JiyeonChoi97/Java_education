
public class Phone {

	
	String model;
	String color;
	int price;
	
	/*
	 # 생성자 (constructor)
	 
	 1. 생성자는 객체를 생성하는 역할을 하며, 그렇기 때문에 반드시 클래스 내부에 하나 이상 존재해야 합니다.
	 
	 2. 생성자를 하나도 선언하지 않았을 시 JAM(Java 가상 머신)이 
	 	자동으로 매개변수가 존재하지 않는 기본 형태의 생성자(default constructor)를 하나 만들어 줍니다. 
	 	
	 3. 생성자는 반드시 클래스 이름과 대/소문자까지 동일하게 작성하여 선언하며, 리턴 타입이 존재하지 않습니다.
	 
	 4. 생성자 내부에는 객체가 생성되자마자 해야 할 로직들을 기술할 수 있습니다.
	 */
	
	// 생성자 선언.
	Phone() {
		System.out.println("1번 생성자 호출!");
		model = "폴더폰";
		color = "회색";
		price = 200000;
	}
	
	
	/*
	 # 생성자 오버로딩(중복 선언)
	 1. 생서자는 중복해서 여러 개 만들 수 있습니다. 
	 2. 단, 생성자의 매개변수의 타입, 갯수, 순서가 달라야 합니다. 
	 */
	
	Phone(String pModel) {
		System.out.println("2번 생성자 호출!");
		model = pModel;
		color = "블루";
		price = 100000;
	}
	
	Phone(String pModel, String pColor) {
		System.out.println("3번 생성자 호출!");
		model = pModel;
		color = pColor;
		price = 3000000;
	}
	
	
	void showSpec() {
		System.out.println("*** 핸드폰의 정보***");
		System.out.println("# 모델명 : " + model);
		System.out.println("# 색상 : " + color);
		System.out.println("# 가격 : " + price + "원");
		System.out.println();
	}
}
