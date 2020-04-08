package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		
//		String[] str = new String[100];
		
		List<String> list = new ArrayList<>();
		
		String str1 = "멍멍이";
		String str2 = "야옹이";
		
		// list에 객체를 추가 : add(객체)
		list.add(str1);
		list.add(str2);
		list.add("짹쨱이");
		list.add("개구리");
		list.add("야옹이");	// list는 객체의 중복 저장을 허용합니다.
		list.add("오징어");
		System.out.println(list);
		
		// list에 객체 삽입 add(index, 객체) : 객체를 해당 인덱스에 삽입.
		list.add(2, "어흥이");
		System.out.println(list);
		
		// list에 저장된 총 객체의 수 얻기 : size()
		System.out.println("list에 저장된 요소의 갯수 : "+ list.size());

		// list에 데이터 수정하기 : set(index, 수정할 객체)
//		list[3] = "메롱이";
		list.set(3, "메롱이");
		System.out.println(list);
		
		// list에 저장된 객체를 참조하기 : get(index)
		String nick = list.get(4);
		System.out.println(nick);
		
		// list에서 객체 데이터 삭제 : remove(index), remove(객체)
		list.remove(5);
		System.out.println(list);
		
		list.remove(str1);
		System.out.println(list);
		
		// list 내부에 저장된 객체의 존재 유무를 확인 : contains(객체)
		System.out.println(list.contains("어흥이"));
		System.out.println(list.contains("삐약이"));
		
		// list의 반복문 처리 
		for(String s : list) {
			System.out.println(s);
		}
		
		// 리스트 내부 객체 인덱스 확인 : indexOf(객체)
		int idx = list.indexOf("어흥이");
		System.out.println("어흥이가 위치한 인덱스 : " + idx);
		
		// list 내부 객체 전체 삭지 : clear()
		list.clear();
		System.out.println(list);
		
		// list 내부가 비어있는지의 여부를 확인 : isEmpty()
		System.out.println(list.isEmpty());
		
		// 리스트의 정렬.
		// 기본데이터 타입의 객체 형태
		// Byte, Short, Integer, Long, Float, Double, Boolean, Character
		List<Integer> scores = new ArrayList<>();
		scores.add(90);scores.add(47);scores.add(69);
		scores.add(80);scores.add(100);scores.add(21);
		System.out.println(scores);
		
		// 오름차 정렬
		Collections.sort(scores);
		System.out.println(scores);
		
		// 내림차 정렬
		Collections.sort(scores, Collections.reverseOrder());
		System.out.println(scores);
		
		
		
	}

}
