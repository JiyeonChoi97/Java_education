package inherit.good;

/*
 # 부모 클래스, 상위 클래스 (Parent, Super Class)
 
 - 데이터를 다른 클래스에게 상속하는 클래스를 부모 클래스라고 부릅니다. 
 
 - 상속을 사용하면 데이터를 물려받는 클래스에게 부모클래스의 멤버변수와 메서드가 상속됩니다. 
 	단, 생성자는 상속되지 않습니다. 
 */



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
