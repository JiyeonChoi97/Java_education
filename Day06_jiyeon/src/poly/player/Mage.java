package poly.player;

public class Mage extends Player {

	
	int mana;

	Mage(String name){
		super(name);
		this.mana = 100;
	}
	
	@Override
	void characterInfo() {
		// TODO Auto-generated method stub
		super.characterInfo();
		System.out.println("# mana : " + mana);
	}
	
	public void blizzard(Player[] players) {
		
		System.out.printf("%s님이 눈보라 시전!!!!!\n" , this.name);
		System.out.println("==============================");
		
		for(Player p : players) {
			int damage = (int) (Math.random()*6 +10);
			p.hp -= damage;
			System.out.printf("%s님이 %d의 피해를 입었습니다. (남은체력 : %d)\n", p.name, damage, p.hp);
		}
		
		
	}
	
}
