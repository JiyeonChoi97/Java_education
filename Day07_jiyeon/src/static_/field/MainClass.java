package static_.field;

public class MainClass {

	public static void main(String[] args) {

		Count c1 = new Count();

		c1.a += 5;
		c1.b += 5;

		System.out.println("인스턴스 변수 c1.a : "+ c1.a);
		System.out.println("정적 변수 c1.b : "+ c1.b);

		System.out.println("=============================");

		Count c2 = new Count();

		c2.a += 7;
		c2.b += 7;

		System.out.println("인스턴스 변수 c2.a : "+ c2.a);
		System.out.println("정적 변수 c2.b : "+ c2.b);

		System.out.println("=============================");

		Count c3 = new Count();

		c3.a += 8;
		c3.b += 8;

		System.out.println("인스턴스 변수 c3.a : "+ c3.a);
		System.out.println("정적 변수 c3.b : "+ c3.b);
		System.out.println("정적 변수 c1.b : "+ c1.b);
		
		/*
		 - static이 붙은 데이터는 그 데이터가 선언된 클래스의 이름으로 바로 찹조할 수 있습니다.
		 */
		
		Count.b += 200;
		System.out.println("정적 변수 c3.b : "+ c3.b);
		System.out.println("정적 변수 c1.b : "+ c1.b);

		
		
		
		

	}
}
