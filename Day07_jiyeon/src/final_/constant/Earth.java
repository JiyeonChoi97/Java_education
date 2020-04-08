package final_.constant;

public class Earth {

	/*
	 # 상수(constant)
	 
	 - 상수는 고정된 불변의 값을 의미합니다. 따라서 어디에서 접근을 하던지 같은 값이 나와야 하며, 값 변경도 불가능해야 합니다. 
	 	따라서 자바에서는 상수를 선언할 때 static과 final을 함께 사용합니다. 
	 - 상수는 대문자로 작성하는 것이 관레이며, 연결 단어가 있을 경우 (_)를 사용하여 연결합니다. 
	 */
	
	static final double RADIUS = 6400;
	static final double SURFACE_AREA;
	
	static {
		SURFACE_AREA = RADIUS * RADIUS * Math.PI * 4;
	}
 
	
	
}
