package poly.player;

public class MainClass {

	public static void main(String[] args) {

		Warrior w1 = new Warrior("전사1");
		Warrior w2 = new Warrior("전사2");
		Mage m1 = new Mage("마법사1");
		Mage m2 = new Mage("마법사2");
		Hunter h1 = new Hunter("사냥꾼1");
		Hunter h2 = new Hunter("사냥꾼2");

		/*
		 1. Mage는 blizzard라는 광역 기술(메서드)을 가지고 있습니다. 
		 2. Mage클래스에 blizzard 메서드를 선언하세요. (void)
		 3. 메서드 호출부에 들어갈 매개값에 맞는 매개변수를 선언하세요.
		 	광역마법이므로 타겟이 여러명이어야 하는데, 매개값은 하나입니다. 
		 4. blizzard라는 기술을 시전하는 사람의 이름을 적절한 키워드를 사용하여 출력해보세요.
		 5. 피해량(데미지)은 10~15사이의 난수를 발생시켜서 타겟들에게 적용해 주세요.
		 6. 기본 객체의 hp는 50입니다. hp에서 피해량을 뺀 남은 체력을 출력해 주세요.

		 -출력예시-
		 마법사1님이 눈보라 시전!!!
		 -------------------
		 전사1님이 11의 피해를 입었습니다. (남은 체력 : 39)
		 전사2님이 13의 피해를 입었습니다. (남은 체력 : 37)
  		 마법사2님이 12의 피해를 입었습니다. (남은 체력 : 38)
		 사냥꾼1님이 10의 피해를 입었습니다. (남은 체력 : 40)
		 사냥꾼2님이 11의 피해를 입었습니다. (남은 체력 : 39)
		 */

		Player[] targets = {w1, w2, m2, h1, h2};	// 다형성 적용시켜 부모타입 이용
		
		m1.blizzard(targets);
		

	}

}
