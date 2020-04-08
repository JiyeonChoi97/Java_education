package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		/*
		 - Map컬렉션은 키(key)와 값(value)이 한 쌍으로 구성된 객체를 저장하는 구조를 가지고 있습니다. 
		 - 키는 중복저장될 수 없으며, 값은 중복 저장할 수 있습니다. 
		 - HashMap은 Map인터페이스를 구현한 대표적인 Map컬렉션 중 하나입니다.
		 */
		
		Map<String, String> map = new HashMap<>();
		
		// map에 객체를 저장 : put(key, value)
		map.put("멍멍이", "김철수");
		map.put("야옹이", "홍길동");
		map.put("짹짹이", "박영희");
		System.out.println(map);
		
		// map은 key의 중복 저장을 허용하지 않습니다. 
		// 만약 중복 key를 통해 put을 사용하면 value가 수정됩니다. 
		map.put("멍멍이", "김갑수");
		map.put("어흥이", "홍길동");
		System.out.println(map);
		
		// map에 저장된 value값을 참조 : get(key)
		String name = map.get("야옹이");
		System.out.println("별명이 야옹이인 학생 : " + name);
		
		// map에 저장된 총 객체의 수 얻기 : size()
		System.out.println("map에 저장된 객체의 수 : " + map.size());
		
		//map에 저장된 key들을 전부 추출하는 메서드 : keySet()
		//keySet을 사용하면 map 안에 있는 모든 key들이 set으로 포장되어 반환됩니다. 
		Set<String> keys = map.keySet();
		for(String s : keys) {
			System.out.println(s + ":" + map.get(s));
		}
		
		// map에 저장된 key들의 존재 유무를 확인하는 메서드 : containKey()
		System.out.println("====================================");
		
		String nick = "어흥이";
		if(map.containsKey(nick)) {
			System.out.printf("별명이 %s인 학생의 이름은 %s 입니다.\n", nick, map.get(nick));
		} else {
			System.out.println("존재하지 않는 별명입니다. ");
		}
		
		// map의 데이터를 삭제 : remove(key)
		// remov 메서드에 key를 넣어주면 value도 함께 제거됩니다. 
		map.remove("야옹이");
		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
