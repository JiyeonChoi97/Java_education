package poly.instanceof_;

public class MainClass {

	static void method1(Parent p) {
		
		Child c = (Child) p;
		System.out.println("강제 형 변환 성공!");
	}
	
	static void method2(Parent p) {
	
		if(p instanceof Child) {
			Child c = (Child) p;
			System.out.println("강제 형 변환 성공!");
		} else {
			System.out.println("Child 타입을 가질 수 없는 객체입니다.");
		}
		
	}
	
	public static void main(String[] args) {

		Parent p1 = new Child();
		method1(p1);
		
		Parent p2 = new Parent();
		method2(p2); 
		
		
		
		
	}

}
