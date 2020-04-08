package static_.init;

public class LapTop {

	static String company;
	static String model;
	static String info;
	int price;
	
	// 정적 변수를 자동으로 초기화하려면 정적 초기화자를 사용합니다. 
	
	static {
		System.out.println("정적 초기화자가 호출됨!");
		company = "LG";
		model = "gram";
		info = company + "-" + model;
	}
	
	public LapTop() {
		System.out.println("생성자가 호출됨!");
		price = 1000000;
	}
	
	
	
	
}
