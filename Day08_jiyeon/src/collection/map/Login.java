package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		Map<String, String> users = new HashMap<>();

		// key : userID, value : userPW
		users.put("abc1234", "aaa1111");
		users.put("kim1234", "kkk1234");
		users.put("park1234", "ppp1234");

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("아이디를 입력하세요 : ");
			String ID = sc.next();
			if(users.containsKey(ID)) {
				System.out.println("비밀번호를 입력하세요 : ");
				String PW = sc.next();
				if(PW.equals(users.get(ID))) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("비밀번호가 틀렸습니다. ");
				}
			}else {
				System.out.println("아이디가 존재하지 않습니다. ");
			}

		}


	}

}
