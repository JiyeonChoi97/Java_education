package Modi.member.pac2;

import Modi.member.pac1.A;

public class C {
	
	
	public C() {
		A a = new A();
		
		a.x = 1; // public
//		a.y = 2; // p.f(x)
//		a.z = 3; // private(x)
		
		a.method1(); // public
//		a.method2(); // p.f(x)
//		a.method3(); // private(x)
		
		
	}



}
