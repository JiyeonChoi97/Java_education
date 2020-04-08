package inter.basic;

public class MainClass {

	public static void main(String[] args) {

		
		// 인터페이스는 객체를 생성할 수 없는 추상적인 개념입니다. 
//		Inter1 i1 = new Inter1(); // 객체 생성 불가
		
		System.out.println("1인치 : "+ Inter1.inch);
		
		ImplClass1 i1 = new ImplClass1();
		i1.method1();
		i1.method2();
		
		// 다형성을 적용시키려면 상속이 전제되어야 하지만, 추가로 인터페이스 구현관계가 있는 경우에도 다형성 구현이 가능합니다. 
		// 부모타입 = 자식객체 < - > 인터페이스타입 = 구현객체
		
		Inter1 it1 = new ImplClass1();
		it1.method1();
		// 연산자의 연산 우선 순위 
		// 괄호() >>> 참조(.) >>> 단항 >>> 2항 >>> 3항 >>> 대입
		((ImplClass1) it1).method2();
		Inter2 it2 = new ImplClass1();
		Inter1 it3 = new ImplClass2();
		Inter2 it4 = new ImplClass3();
		
//		Inter2 it5 = new ImplClass2(); (x)	// 광계가 없다면 다형성 x
//		Inter1 it6 = new ImplClass3(); (x)
		
		Inter[] inters = {it1, it2, it3, it4};
		
	}

}
