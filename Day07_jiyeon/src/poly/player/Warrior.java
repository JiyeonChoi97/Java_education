package poly.player;

public class Warrior extends Player {

	

	int rage;
	
	Warrior(String name) {
		super(name);	// 적지 않아도 묵시적으로 super(); 있음
		this.rage = 60;
	}
	
	
	
	@Override
	void characterInfo() {
		// TODO Auto-generated method stub
		super.characterInfo();	
		System.out.println("# 분노 : " + rage);
	}
	
	void rush(Player p) {

		/*
		 1. 기술을 시전하는 사용자의 이름과 피격당하는 사람의 이름을 출력해 주세요.
		 	ex) XXX님이 XXX님에게 돌진 기술 시전!!!
		 2. rush라는 기술은 마법사에게는 20의 피해, 사냥꾼에게는 15의 피해, 전사에게는 10의 피해를 각각 입힙니다.  
		 3. instanceof 키워드를 사용하여 매개변수로 들어오는 객체가 무엇인지를 판별하여 각각 다른 데미지를 적용시켜 주세요.
		 4. 남은 체력도 마찬가지로 출력해 주시면 되겠습니다. 
		 
		 출력 예시
		 전사1님이 전사2님에게 돌진 시전!!
		 전사2(전사)님이 10의 피해를 입었습니다. 
		 전사2님의 남은 체력 : 30
		 */

		System.out.printf("%s님이 %s님에게 돌진 시전!!\n" , this.name, p.name);
		
		if(p instanceof Warrior) {
			p.hp -= 10;
			System.out.printf("%s(전사)님이 10의 피해를 입었습니다. \n", p.name);
			
		} else if(p instanceof Mage) {
			p.hp -= 20;
			System.out.printf("%s(마법사)님이 20의 피해를 입었습니다. \n", p.name);
		} else if(p instanceof Hunter) {
			p.hp -= 15;
			System.out.printf("%s(사냥꾼)님이 15의 피해를 입었습니다. \n", p.name);
		} else return;
		
		System.out.printf("%s님의 남은 체력 : %d\n", p.name, p.hp);
		System.out.println("==========================");
	}
		
	
}
