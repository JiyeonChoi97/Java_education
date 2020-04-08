package Modi.member.pac1;

public class B {

	
	public B() {
	
		A a = new A();
		a.x = 1; // public
		a.y = 2; // p.f
//		a.z = 2; //private(x)

		a.method1(); // public
		a.method2(); // p.f
//		a.method3(); // private (x)
		
	}
}
