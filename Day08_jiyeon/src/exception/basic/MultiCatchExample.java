package exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("정수 : ");
			int num = sc.nextInt();
			
			int result = 100/num;
			
			String s = null;
			s.equals("안녕~");
			
			
		} catch(InputMismatchException | ArithmeticException e) {
			System.out.println("입력값이 잘못되었습니다람쥐");
		} catch(NullPointerException e) {
			System.out.println("null 값을 참조하여 발생한 오류입니다!!!!!!!!!!!!!");
		} catch(Exception e) {
			System.out.println("알 수 없는 오류 발생 ㅜㅡㅜ");
		}
		
		
		
		
		
		
		
		
		
	}

}
