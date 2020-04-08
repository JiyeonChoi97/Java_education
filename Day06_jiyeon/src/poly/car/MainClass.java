package poly.car;

public class MainClass {

	public static void main(String[] args) {

		
		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata();
		Sonata s3 = new Sonata();
		
		K5 k1 = new K5();
		K5 k2 = new K5(); 
		K5 k3 = new K5();
		
		Malibu m1 = new Malibu();
		Malibu m2 = new Malibu();
		Malibu m3 = new Malibu();
		Malibu m4 = new Malibu();
//		
//		s1.run();
//		s2.run();
//		s3.run();
		
		Sonata[] sonatas = {s1, s2, s3};
		for(Sonata s : sonatas) {
			s.run();
		}
		
		K5[] K5s = {k1,k2,k3};
		for(K5 k : K5s) {
			k.run();
		}
		
		Car[] cars = {s1,s2,s3,k1,k2,k3,m1,m2,m3,m4};
		for(Car c : cars) {
			c.run();
		}
		
		System.out.println("===============================");
		
		System.out.println("타이어 교체 작업!!!!!!!!!!!!!!!!!!!!!!!");
		s1.frontLeft = new Ntire();
		s1.frontRight = new Ntire();
		s1.rearLeft = new Htire();
		s1.rearRight = new Htire();
		
		System.out.println("===============================");

		Driver kim = new Driver();
		kim.drive(s1);
		kim.drive(k1);
		kim.drive(m3);

		
		
	}

}
