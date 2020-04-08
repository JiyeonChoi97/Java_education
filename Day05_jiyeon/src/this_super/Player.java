package this_super;

public class Player {

	String name;
	int level;
	int atk;
	int hp;
	
	Player(){
		System.out.println("Player의 1번 생성자 호출!");
//		System.out.println("this의 주소값 : " + this);
		level = 1;
		atk = 4;
		hp = 50;
		
	}
	
	Player(String name) {
		this();
		System.out.println("Player의 2번 생성자 호출!");
//		System.out.println("this의 주소값 : " + this);
		level = 1;
		atk = 4;
		hp = 50;
		this.name = name;
	}
	
	Player(String name, int hp){
		this(name);	// 생성자 내부에서 다른 생성자를 호출하면 제일 상단부에 기재 
		System.out.println("Player의 3번 생성자 호출!");
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
