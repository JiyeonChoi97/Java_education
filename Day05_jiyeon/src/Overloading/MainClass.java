package Overloading;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		
		/*
		 - Calculator 클래스에 calcRectArea()메서드를 선언하여, 길이를 하나만 전달하면 정사각형의 넓이를 리턴,
		 	길이를 두개( 가로, 세로) 전달하면 직사각형의 넓이를 리턴하도록 오버로딩을 사용하여 메서드를 선언하세요
		 - MainClass 에서 메서드를 매개값을 다르게 주고 실제로 호출 해 보세요.
		 * 
		 */		
		
		Calculator cal = new Calculator();
		cal.calcRectArea(5);
		cal.calcRectArea(5, 10);
		
	}

}
