package poly.param;

public class MainClass {

	public static void main(String[] args) {

		Driver kim = new Driver();
		Car c = kim.buyCar("소나타");
		c.run();
//		c.enterMembership(); // 자식 고유의 메소드인데 c는 부모 타입이므로 사용불가
		
		Sonata s = (Sonata) c;
		s.enterMembership();
		
		System.out.println("==========================");
		
		CarShop shop = new CarShop();
		
		shop.carPrice(c);
		
		shop.carPrice(new K5());
		shop.carPrice(kim.buyCar("말리부"));
		
	}

}
