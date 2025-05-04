package week8;

public class Calculator {
	// 필드
	String color;
	String size;
	
	public Calculator(String color, String size) {
		// 초기화
		this.color = color;
		this.size = size;
	}
	// 전원켜기
	// 리턴값이 없는 경우
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	// 전원 끄기
	// 리턴값이 없는 경우
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	int plus(int x, int y) {
		return x+y;
	}
	
	double divide(int x, int y) {
		return (double)x/y;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		return sum / 2;
	}
	void exec() {
		double result = avg(7,10);
		printFunc("실행 결과: " + result);
	}
	void printFunc(String strMsg) {
		System.out.println(strMsg);
	}
	
	
	// 매개변수의 개수를 모를 경우
	int sum1(int[] values) {
		int sum = 0; // 누적변수초기화
//		for(int i : values)
//			sum += i;
		for(int i=0; i<values.length; i++)
			sum += values[i];
		return sum;
	}
	
	int sum2(int...values) {
		int sum = 0;
//		for(int i : values)
//			sum += i;
		for(int i=0; i<values.length; i++)
			sum += values[i];
		return sum;
	}
	
	
	// 정적 멤버 사용 실습
	static double pi = 3.14;
	static int plus2(int x, int y) {
		return x+y;
	}
	static int minus(int x, int y) {
		return x-y;
	}
	
}
