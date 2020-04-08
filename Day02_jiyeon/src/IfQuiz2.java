import java.util.Scanner;

public class IfQuiz2 {

	public static void main(String[] args) {

		
		/*
		 - Scanner 객체로 숫자를 하나 입력받아서 다중 분기 조건문을 사용하여 입력한 숫자가 7의 배수일 때는
		 	"입력하신 숫자는 7의 배수입니다. " 를 출력.
		 	
		 - 입력한 숫자가 7의 배수가 아닐 때는 
		 	"입력하신 숫자는 7의 배수가 아닙니다. " 를 출력.
		 	
		 - 입력한 숫자가 0이라면
		 	"입력하신 숫자는 0입니다."를 출력.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		} else if (num % 7 == 0) {
			System.out.println("입력하신 숫자는 7의 배수입니다. ");
		} else {
			System.out.println("입력하신 숫자는 7의 배수가 아닙니다. ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
