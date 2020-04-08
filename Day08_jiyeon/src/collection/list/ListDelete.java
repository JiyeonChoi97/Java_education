package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListDelete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<String> kakao = new ArrayList<>();
		kakao.add("무지");
		kakao.add("라이언");
		kakao.add("어피치");
		kakao.add("제이지");
		kakao.add("튜브");
		
		System.out.println("변경 전 정보 : " + kakao);
		
		/*
		 - 삭제할 별명을 입력받아서 해당 별명이 리스트에 존재한다면 삭제를 진행해 주시고, 
		       해당별명이 리스트에 존재하지 않는다면 "없는 별명입니다."라고 출력해 주세요.
		 출력 예시
		 -삭제할 멤버의 이름을 입력하세요. 
		 라이언
		 라이언을(를) 삭제합니다. 
		 #삭제 후 정보 [무지, 어피치, 제이지, 튜브]
		 */
		System.out.println("삭제할 멤버의 이름을 입력하세요.");
		String name = sc.next();
		
		if (kakao.contains(name)) {
			System.out.println(name + "을(를) 삭제합니다. ");
			kakao.remove(name);
			System.out.println("#삭제 후 정보 "+kakao);
		} else {
			System.out.println("해당 멤버는 존재하지 않습니다. ");
		} 
		
	}

}
