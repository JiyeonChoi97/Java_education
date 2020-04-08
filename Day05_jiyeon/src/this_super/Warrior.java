package this_super;

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
	
	void rush() {
		System.out.println(name + "님이 돌진 스킬을 시전합니다!");
	}
		
	
}
