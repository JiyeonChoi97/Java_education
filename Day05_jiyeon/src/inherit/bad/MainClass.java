package inherit.bad;

public class MainClass {

	public static void main(String[] args) {
		Warrior w2 = new Warrior();
		w2.name = "전사1";
		w2.level = 1;
		w2.atk = 3;
		w2.hp = 50;
		w2.rage = 60;
		w2.characterInfo();
		
		System.out.println("=======================");

		Mage m1 = new Mage();
		m1.name = "해리포터";
		m1.level = 10000;
		m1.atk = 32323;
		m1.hp = 32213;
		m1.mana = 231;
		m1.characterInfo();
		
	}
	}

