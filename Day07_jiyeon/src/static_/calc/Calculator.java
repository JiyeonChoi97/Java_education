package static_.calc;

public class Calculator {

	
	/*
	 - 계산기마다 색깔을 각각 다르게 적용시키고 싶다면 color에 static을 붙이시면 안됩니다. 
	   static변수는 모든 객체가 공유하는 공유 변수 개념으로 사용하기 때문에 객체마다 색을 다르게 하고 싶으면 객체별로 따로 관리해야 합니ㅏㄷ. 
	   
	 - pi같은 원주율 값은 계산기마다 값이 동일하기 때문에 static을 붙여서 데이터를 공유하는 것이 좋습니다.
	 */
		
	String color;
	static double pi = 3.14159265;

	/*
	 - 메서드 내부에서 non-static 데이터를 참조하고 있는 메서드는 해당 변수의 정확한 위치(주소값)을 알려줘야 하기 때문에 정적 메서드로 선언하면 안됩니다. 
	 - static 메서드는 객체의 생성과 무관하게 호출이 가능하므로 non-static 데이터의 주소값을 모를 수 있습니다. 
	 */
	public void paint(String color) {
		System.out.println("계산기에 "+ color + "색을 칠합니다.");
		this.color = color;
	}
	
	/*
	 - 메서드 내부에서 인스턴스 변수를 참조하지 않고, 범용성 있게 사용하는 메서드는 static 키워드를 사용하여 정적 메서드로 선언하는 것이 좋습니다.
	 */
	static double areaCircle(int r) {
		return r * r * pi;
	}
	
}
