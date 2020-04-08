import java.util.Scanner;

public class IfQuiz {

	public static void main(String[] args) {

		/*
		 - 신장과 나이를 Scanner로 입력받으세요
		 - 키 : 140cm 이상 , 나이 : 8세 이상인 사람만 탑승할 수 있는 놀이기구입니다. 
		 - 두 조건 중 하나라도 조건을 만족하지 못한다면 놀이기구 탑승이 불가합니다.
		 - 조건식을 사용하여 사용자가 입력한 조건이 놀이기구 탑승 여부에 일치, 불일치하는지를 출력해 주세요.
		 	(놀이기구 탑승이 가능합니다, 놀이기구를 탑승할 수 없습니다.)
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("키를 입력하세요 : ");
		int height = sc.nextInt();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();

		System.out.println("========================");
		if(height>=140 && age>=8) {
			System.out.println("놀이기구 탑승이 가능합니다. ");
		}
		else {
			System.out.println("놀이기구를 탑승할 수 없습니다. ");
		}	

		sc.close();








	}

}
