package abs.good;

public abstract class HeadStore {

	/*
	 # 추상 클래스 
	 
	 1. 추상 클래스는 클래스의 키워드 앞에 abstract를 붙여서 선언합니다. 
	 2. 추상 클래스의 메서드에 abstract를 붙이면 해당 메서드는 실체가 없는 추상 메서드가 되며, 
	 	이 메서드는 상속을 통해 자식 클래스에서 반드시 오버라이딩을 하도록 강요됩니다.
	 3. 추상 메서드는 실체가 존재하지 않는 메서드의 틀 역할을 하기 때문에 메서드의 바디부분이 없고 ({}), 세미콜론으로 메서드 선언을 마감합니다. 
	 4. 일반 클래스에서는 추상 메서드를 선언할 수 없습니다. 
	 	추상메서드가 단 하나라도 존재하는 경우에는 반드시 해당 클래스를 추상클래스로 선언해야 합니다.
	 5. 추상 클래스 내부에 반드시 추상 메서드만을 선언할 필요는 없습니다.
	 	다른 메서드들도 모두 선언할 수 있습니다. 
	 */
	
	public int i;
	
	public abstract void orderApple();
	public abstract void orderBanana();
	public abstract void orderMelon();
	
	public void orderWaterMelon() {
		System.out.println("수박 쥬스의 가격은 4000원입니다. ");
	}
	
	
	public HeadStore() {
	
		System.out.println("HeadStore 객체 생성!");
	}
	
	
}
