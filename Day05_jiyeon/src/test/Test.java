package test;

//import fruit.Apple;
//import fruit.Banana;
//import fruit.Melon;

import fruit.*;	// fruit 패키지의 모든 클래스를 import하겠다.
import juice.*;

public class Test {


	public static void main(String[] args) {
		
		/*
		 서로 다른 패키지 내의 같은 이름의 클래스 객체를 생성할 때는 반드시 패키지 경로를 직접 지정해 주셔야 합니다. 
		 */
		
		fruit.Apple a1 = new fruit.Apple();
		juice.Apple a2 = new juice.Apple();
		Banana b = new Banana();
		Melon m = new Melon();
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
	}
}
