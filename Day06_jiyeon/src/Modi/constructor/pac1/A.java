package Modi.constructor.pac1;

public class A {
	
	A a1 = new A(true);
	A a2 = new A(30);
	A a3 = new A(3.14);
	
	
	// 생성자 선언
	public A(boolean b){}
	A(int i){}	// package friendly
	private A(double d){}

}
