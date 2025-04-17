package week7;

public class Car {
	// Car 객체가 가지는 속성을 정의 => 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	// 생성자가 없으면 컴파일러가 기본 생성자를 자동으로 만들어줌
	// 생성자가 하나라도 정의되어 있으면 기본 생성자는 안만들어
	Car() {
		// 기본 생성
	}
	
	// 매개변수가 있는 생성자 정의
	Car(String m, String c, int maxS) {
		// 생성자의 기본 역할은 필드값의 초기화를 담당하는 것
		model = m;
		color = c;
		maxSpeed = maxS;
	}
}
