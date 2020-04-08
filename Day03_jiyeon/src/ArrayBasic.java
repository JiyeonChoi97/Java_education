
public class ArrayBasic {

	public static void main(String[] args) {

		
		// 1. 배열 변수의 선언
		int[] arr; // JAVA 스타일 문법
		int arr2[]; // C 언어 스타일 
		
		// 2. 배열 객체 생성
		arr = new int[5];
		
		// 3. 배열 객체의 초기화 - 배열 내부에 실제 값을 저장
		// 배열의 초기화는 인덱스를 통해 수행합니다. 
		// 인덱스란 배열 내부의 위치를 지정하는 값입니다.
		// 인덱스는 0번부터 시작하여 1씩 순차적으로 증가합니다.
		
		arr[0] = 87;
		arr[1] = 95;
		arr[2] = arr[0];
		arr[3] = (int) 3.14;
		arr[4] = 100;

		
		// 4. 배열의 총 크기(길이) 확인 : (배열변수명.length)
		System.out.println("arr배열의 길이는 : " + arr.length);
		
		
		
		
		
		
		
	}

}
