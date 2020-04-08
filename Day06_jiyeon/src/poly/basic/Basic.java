package poly.basic;

/*
 - 자바에서는 하나의 클래스 파일 안에 여러 클래스들을 선언할 수 있습니다.
 - 단, 파일명과 동일한 이름을 가진 클래스가 반드시 존재해야 하며, 해당 클래스만 public클래스로 선언해야 합니ㅏㄷ. 
 */


class A{}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}



public class Basic {

	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	/*
	 - 다형성이란 자식객체가 모든 부모타입을 가질 수 있는 특성을 의미합니다. 
	 - 즉, 부모 타입 변수에 자식 객체의 주소값이 언제든지 저장될 수 있다는 것입니다.
	 */
	
	
	A x1 = new B();	// 클래스 타입 B -> A로 자동 형 변환(promotion)
	A x2 = new C();
	A x3 = new D();
	A x4 = new E();
	A x5 = b;
	
	
	B x6 = new D();
	C x7 = new E();
	
	// 상속관계가 없다면 다형성 적용이 불가능합니다. 
	// 즉, 다형성은 무조건 상속 관계 하에서만 발생합니다. 
	
	
//	B x8 = new E(); (X)
//	C x9 = new D(); (x)
//	B x10 = new C(); (x)
//	D x11 = new E(); (x)
	
	
	// Object는 자바의 최상위 타입입니다.
	// 모든 클래스는 Object를 상속받습니다. 
	Object o1 = new A();
	Object o2 = new B();
	Object o3 = new C();
	Object o4 = new D();
	Object o5 = new E();
	Object o6 = new String("안녕하세요~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	Object o7 = new Basic();
	
	
	
	
	
}
