package inherit.bad;

public class Player {

	String name;
	int level;
	int atk;
	int hp;

	
	void characterInfo() {
		System.out.println("*** 캐릭터 정보 ***");
		System.out.println("# id : " + name);
		System.out.println("# level : " + level);
		System.out.println("# 공격력 : " + atk);
		System.out.println("# 체력 : " + hp);
	}
	
}
