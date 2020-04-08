import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {

		
		/*
		 - 스캐너를 사용하여 이름과 나이를 입력받아서 
		 	이름 : xxx
		 	나이 : xx세
		 	출생년도 : ----년
		 	
		 	를 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();

		int year;
		year = 2020-age;
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("출생년도 : " + year + "년");
		
			
		
		
		
		
		
		
		
		
	}

}
