
public class PhoneMain {

	public static void main(String[] args) {

		
		Phone basic = new Phone();

		
		basic.showSpec();
		
		System.out.println("===========================");
		
		Phone galaxyNote10 = new Phone("갤럭시노트10");
		galaxyNote10.showSpec();
		
		System.out.println("===========================");
		Phone iPhone11 = new Phone("아이폰11", "화이트");
		iPhone11.showSpec();
	}
}

