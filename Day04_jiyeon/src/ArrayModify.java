import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {

	public static void main(String[] args) {


		String[] foods = {"치킨", "보쌈", "삼겹살", "피자"};
		System.out.println(Arrays.toString(foods));

		foods[1] = "짜장면";
		foods[0] = "핫도그";
		System.out.println(Arrays.toString(foods));

		System.out.println("========================================");

		// 배열의 인덱스 번호 탐색.

		Scanner sc = new Scanner(System.in);
		System.out.print("탐색할 음식명을 입력하세요 : ");
		String name = sc.next();

		int i ;
		for(i= 0; i<foods.length; i++) {
			if(name.equals(foods[i])){
				System.out.println("탐색 완료");
				System.out.println("인덱스 번호 : " + i + "번");
				break;
			}

		}
		if(i == foods.length) {
			System.out.println("입력한 음식을 찾을 수 없습니다.");
		}
		
				
		
		
		

	}

}
