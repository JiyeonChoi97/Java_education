package inherit.bad;

public class Mage extends Player {

	
	int mana;

	@Override
	void characterInfo() {
		// TODO Auto-generated method stub
		super.characterInfo();
		System.out.println("# mana : " + mana);
	}
	
	
}
