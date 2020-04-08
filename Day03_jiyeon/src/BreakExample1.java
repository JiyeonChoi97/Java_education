
public class BreakExample1 {

	public static void main(String[] args) {

		
		for(int i = 1; i <= 10; i++) {
			if(i > 7) 
				break;
			System.out.print(i + " ");
			
		}
		System.out.println("\n반복문 종료!");

		System.out.println("==============================");
		
		/*
		 내부 반복문에서 break를 사용하여 외부 반복문까지 한번에 탈출하고 싶다면, 탈출하고 싶은 반복문 앞에 label(이름)을 붙입니다.
		 그리고 break를 선언할때 label을 함께 선언합니다.
		 */
		
		outer : for(int i=0; i<3; i++) {
			for(int j = 0; j<2;j++) {
				if(i == j) break outer;
				System.out.println(i+ "-" + j);
			}
		}
	}
}
