package static_.method;

public class Count {

	
	public int a; // 인스턴스 변수
	public static int b; // 정적 변수
	
	/*
	 # 인스턴스 메서드 : 인스턴스 메서드 안에서는 정적 변수(static)와 인스턴스 변수 모두 참조할 수 있습니다. 
	 */
	public int method1() {
		return this.a + this.b;
	}

	
	/*
	 # 정적 메서드
	 - static 블록(메서드, 정적 초기화자) 내부에서는 static이 붙은 변수나 메서드만 참조할 수 있습니다.
	 - static 블록 내부에서 non-static 멤버를 참조하려면 반드시 객체를 통해 참조해야 합니다. 
	 */
	public static int method2() {
	
		Count ccc = new Count();
		return ccc.a + b;
	}

}
