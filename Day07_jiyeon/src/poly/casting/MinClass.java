package poly.casting;

public class MinClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p = new Parent();

		p.n1 = 1;
		//		p.n2 = 2; (x)

		p.method1();
		p.method2();
		//		p.method3(); (x)  //부모는 자식의 어떤것도 가질 수 없다

		System.out.println("---------------------------------------------");

		Child c = new Child();

		c.n1 = 4;
		c.n2 = 5;

		c.method1();
		c.method2();
		c.method3();

		System.out.println("---------------------------------------------");

		Parent p2 = new Child();
		System.out.println(p2);

		//		p2.n2 = 4; (x)
		p2.method1();
		p2.method2();
		//		p2.method3(); (x)

		/*
		 - promotion(다형성)이 적용되면 자식클래스의 본래의 멤버(필드, 메서드)를 참조할 수 없는 문제가 생깁니다.
		 - 이 문제를 해결하기 위해 강제 타입변환(DownCasting)을 사용합니다. 
		 */
		System.out.println("=========================================");

		Child c2 = (Child) p2;
		c2.n2 = 4;
		c2.method3();

		System.out.println("c2의 주소값 : " + c2);
		System.out.println("p2의 주소값 : " + p2);

		/*
		 - 한번 promotion이 일어난 객체를 대상으로만 강제 타입변환을 사용할 수 있습니다. 
		 */

		//		Child c3 = (Child) p; (x)

		Object o = new Parent();
		//		o.method1(); (x)
		Parent pp = (Parent) o;
		pp.method1();
	}



}

