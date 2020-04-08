import java.util.Arrays;

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

		// 5. 배열에 저장된 값을 참조하는 법(사용하는 법)
		System.out.println("===============================");

		System.out.println("배열의 1번째 데이터 : " + arr[0]);
		System.out.println("배열의 2번째 데이터 : " + arr[1]);
		System.out.println("배열의 3번째 데이터 : " + arr[2]);
		System.out.println("배열의 4번째 데이터 : " + arr[3]);
		System.out.println("배열의 5번째 데이터 : " + arr[4]); 

		// 6. 배열의 반복문 처리
		System.out.println("===============================");

		for(int idx = 0; idx < arr.length; idx++) {
			System.out.println("배열의 " + (idx + 1) + "번째 데이터 : " + arr[idx]);
		}

		// 7. 배열의 내부 요소값을 문자열 형태로 한눈에 출력하기
		System.out.println("===============================");

		System.out.println(Arrays.toString(arr));
		
		// 8. 배열의 선언과 동시에 생성을 하는 방법
		double[] dArr = new double[3];
		String[] sArr = new String[4];
		byte[] bArr = new byte[10];
		
		System.out.println("===============================");
		System.out.println(Arrays.toString(dArr));
		System.out.println(Arrays.toString(sArr));
		System.out.println(Arrays.toString(bArr));
		System.out.println("===============================");
		
		// 배열의 생성과 동시에 초기화를 하는 방법
		char[] letters = new char[] {'J', 'i', 'Y', 'e', 'o', 'n'};
		System.out.println(Arrays.toString(letters));
		
		// 선언과 동시에 초기화를 할 때 딱 1 번만 가능한 문법
		String[] names = {"김철수", "박영희", "홍길동"};
		System.out.println(Arrays.toString(names));
		
//		names = {"김철수", "박영희", "홍길동", "고길동"}; // (X) 추가 불가
		names = new String[] {"김철수", "박영희", "홍길동", "고길동"};
		System.out.println(Arrays.toString(names));
		
		
	}

}