package poly.player;

public class Player {

	String name;
	int level;
	int atk;
	int hp;
	
	Player(){
		level = 1;
		atk = 4;
		hp = 50;
		
	}
	
	Player(String name) {
		this();
		level = 1;
		atk = 4;
		hp = 50;
		this.name = name;
	}
	
	Player(String name, int hp){
		this.hp = hp;
	}

	
	void characterInfo() {
		System.out.println("*** 캐릭터 정보 ***");
		System.out.println("# id : " + name);
		System.out.println("# level : " + level);
		System.out.println("# 공격력 : " + atk);
		System.out.println("# 체력 : " + hp);
//		System.out.println("이 메서드를 부르는 객체의 이름 : " + this.name);
	}
	
}
