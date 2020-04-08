package exception.basic;

public class FinallyExample {

	public static void main(String[] args) {

		String pets[] = {"멍멍이", "야옹이", "짹짹이"};

		for(int i =0; i<7; i++) {
			try {
				System.out.println(pets[i] + " 키우고 싶네유........");

			} catch(Exception e) {
				System.out.println("애완동물의 정보가 없습니다.");
			} finally {
				System.out.println("아무튼 실행되는 문장입니다. \n ==========================");
			}
		}
	}

}