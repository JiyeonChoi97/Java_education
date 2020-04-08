
public class Bread {

	String name;
	int price;
	
	Bread() {
		
	}
	
	Bread(String bName, int bPrice){
		name = bName;
		price = bPrice;
	}
	
	void info() {
		System.out.println("이름 : " + name);
		System.out.println("가격 : " + price);
	}
}
