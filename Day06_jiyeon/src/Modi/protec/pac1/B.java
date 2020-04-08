package Modi.protec.pac1;

public class B {
	
	A a1 = new A(30); // protected
	A a2 = new A(3.15);	// p.f
	
	
	public B() {

		a1.x = 1;	// protected
		a2.y = 2; 	// p.f
		
		a1.method1();
		a2.method2();
	
	
	
	
	
	}
	
	

}
