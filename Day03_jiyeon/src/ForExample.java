
public class ForExample {

	public static void main(String[] args) {

		/*
		// 1~10 까지의 누적합을 구하는 로직 ( while )
		int total = 0;
		int n = 1;
		while (n <= 10) {
			total += n ;
			n++;
			
			*/
		
		// 1~10 까지의 누적합을 구하는 로직 (for)
		int total = 0;
		for(int i = 1; i <= 10;i++) {
			total +=1;
						
		}
		
		// 48 ~ 150 사이의 정수 중 8의 배수를 가로로 출력(for)
		for (int j = 48; j<=150; j++) {
			if(j % 8 == 0) {
				System.out.print(j + " ");
			}
		}
		
		
		System.out.println();
		
		//1~30000 까지의 정수 중 258의 배수의 갯수를 구하여 출력
		
		int count = 0;
		for(int k = 1; k <= 30000; k++) {
			if(k % 258 == 0) {
				count++;
			}
		}
		System.out.println("258의 배수의 갯수는 " + count + "개");
		
		
		
		
		
		
		
		
		
		
	}

}
