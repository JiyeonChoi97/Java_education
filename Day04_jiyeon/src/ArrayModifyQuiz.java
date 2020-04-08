import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifyQuiz {

	public static void main(String[] args) {

		String[] kakao = {"무지", "라이언", "어피치", "제이지", "튜브"};

		/*
		 - 스캐너 객체를 생성해서 변경하고픈 별명을 입력받은 뒤 해당 값의 인덱스 번호를 찾아서 변경 값을 다시 입력받고
		 	해당 변경 값으로 기존 인덱스의 값을 변경해 주세요.

		 	ex) 
		 	변경 전 정보 : [무지, 라이언, 어피치, 제이지, 튜브]
		 	수정할 멤버의 이름을 입력하세요 
		 	> 어피치
		 	어피치의 이름을 변경합니다.
		 	> 샐리
		 	변경 완료!
		 	변경 후 정보 : [무지, 라이언, 샐리, 제이지, 튜브]
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("변경 전 정보 :" + Arrays.toString(kakao) + " 수정할 멤버의 이름을 입력하세요 \n> ");
		String name = sc.next();

		int i;

		for(i = 0; i< kakao.length; i++) {
			if(name.equals(kakao[i])) {
				System.out.print(name +"의 이름을 변경합니다. \n> ");
				kakao[i]  = sc.next();
				System.out.println("변경 완료!");
				System.out.println("* 변경 후 정보 :" + Arrays.toString(kakao));
				break;
			}
		}

		if(i == kakao.length) {
			System.out.println("변경 정보를 찾을 수 없습니다.");
		}
		
		sc.close();







	}

}
