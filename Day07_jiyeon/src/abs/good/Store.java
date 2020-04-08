package abs.good;

public class Store extends HeadStore {

	public Store() {
		super();
		System.out.println("Store 객체 생성!");
	}
	
	@Override
	public void orderApple() {
		System.out.println("사과 쥬스의 가격은 3200원입니다.");
	}

	@Override
	public void orderBanana() {
		System.out.println("바나나 쥬스의 가격은 3000원입니다.");
		
	}

	@Override
	public void orderMelon() {
		System.out.println("멜론 쥬스의 가격은 3500원입니다.");
		
	}

}
