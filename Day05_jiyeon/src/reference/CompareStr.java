package reference;

import java.util.Scanner;

public class CompareStr {

	public static void main(String[] args) {

		User kim = new User("abc1234");

		Scanner sc = new Scanner(System.in);
		System.out.println("비밀번호 : ");
		String password = sc.next();
		
		System.out.println("==의 결과 : " + (kim.pw == password));
		System.out.println("equals의 결과 : " + kim.pw.equals(password));
	}

}
