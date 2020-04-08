package obj.array;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
//		Person kim = new Person("김철수", 32, "남");
//		Person choi = new Person("최영희", 25, "여");
//		Person park = new Person("박길동", 45, "남");
//		
//		kim.personInfo();
//		choi.personInfo();
//		park.personInfo();
		
		
//		int[] arr = new int[5];
//		Person[] people = new Person[3];
//		
//		people[0] = new Person("김철수", 32, "남");
//		people[1] = new Person("최영희", 25, "여");
//		people[2] = new Person("박길동", 45, "남");
		
		
//		int[] arr = {1,3,5,7,9}
		Person[] people = {
				new Person("김철수", 32, "남"),
				new Person("최영희", 25, "여"),
				new Person("박길동", 45, "남")
		};
		
//		System.out.println(Arrays.toString(people));
		
//		for(int i = 0; i < people.length; i++) {
//			people[i].personInfo();
//		}
		
		
		for(Person p : people) {
			p.personInfo();
		}
		
		
		
		
		
		
	}
	
	
	
	
	
}
