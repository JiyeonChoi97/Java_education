package poly.param;

public class CarShop {

	public void carPrice(Car c) {

		if(c instanceof Sonata) {
			System.out.println("소나타의 가격은 2700만원입니다.");
		} else if(c instanceof K5) {
			System.out.println("K5의 가격은 2600만원입니다.");
		} else if(c instanceof Malibu) {
			System.out.println("Malibu의 가격은 2800만원입니다.");
		}


	}










}
