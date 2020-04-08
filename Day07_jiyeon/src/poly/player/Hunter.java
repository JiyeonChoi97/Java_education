package poly.player;

public class Hunter extends Player {

	
	String pet;
	
	Hunter(String name){
		super(name);
		this.pet = "경호";
	}

	@Override
	void characterInfo() {
		// TODO Auto-generated method stub
		super.characterInfo();
		System.out.println("# 펫 이름 : " + pet);
	}
	
	
}
