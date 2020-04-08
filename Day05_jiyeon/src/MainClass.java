
public class MainClass {

	public static void main(String[] args) {

		/*
		 - 객체를 생성하지 않았을 때의 예시를 확인하고 설계용 클래스를 생성하여 속성과 기능을 선언하고
		 	MainClass에서 피자빵, 초코케이크의 기능을 사용해 보세요. 
		 - 클래스의 이름은 Bread로 통일.
		 */
		
//		Bread pizza = new Bread();
//		pizza.name = "피자빵";
//		pizza.price = 500;
//		pizza.info();
//		
//		System.out.println("----------------------");
//		Bread choco = new Bread();
//		choco.name = "초코케이크";
//		choco.price = 1500;
//		choco.info();
//		
	
		Bread pizza = new Bread("피자빵", 500);
		pizza.info();
		System.out.println("----------------------");
		Bread choco = new Bread();
		choco.name = "초코케이크";
		choco.price = 1500;
		choco.info();
		
	}

}
