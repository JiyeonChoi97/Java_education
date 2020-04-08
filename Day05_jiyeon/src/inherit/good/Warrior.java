package inherit.good;

/*
 # 자식 클래스, 하위 클래스(Child, Sub Class)
 
 - 부모 클래스로부터 멤버변수와 메서드를 물려받는 클래스를 자식 클래스라고 부릅니다.
 
 - 상속을 적용시키려면 자식 클래스의 클래스 선언부 클래스 이름 뒤에 키워드 extends를 쓰고, 물려받을 부모 클래스의 이름을 적어줍니다. 
 */

public class Warrior extends Player{
	

	int rage;
	
	
	
	
	
	@Override		// Alt + Shift + S  -> override/implement method
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노 : " + rage);
	}





	void rush() {
		System.out.println(name + "님이 돌진 스킬을 시전합니다!");
	}
}
