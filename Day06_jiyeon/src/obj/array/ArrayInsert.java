package obj.array;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Person[] people = new Person[3];
		
		/*
		 1. Scanner를 사용하여 이름, 나이, 성별을 입력받아서 입력받은 값을 토대로 Person 객체를 생성하세요.
		 2. 객체를 3개 생성하신 후 반복문을 이용하여 그 객체의 PersonInfo()를 호출하세요.
		 3. PersonInfo()는 객체 3개가 모두 생성되어 배열에 들어간 후 출력하는 것으로 하겠습니다.
		
		 **** 회원 정보 입력 ****
		 이름 :
		 나이 :
		 성별 : 
		 # 정보입력 성공!
		 .
		 .
		 .
		 이름 : 홍길동, 나이 : 30세, 성별 : 남
		 .
		 .
		 */

		for(int i = 0; i < people.length; i++) {
			System.out.println("*** 회원 정보 입력 ***");
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("성별 : ");
			String gender = sc.next();
			
			people[i] = new Person(name, age, gender);
			System.out.println(" # 정보입력 성공!");
		}
		for(int i = 0; i<people.length; i++) {
			people[i].personInfo();
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
