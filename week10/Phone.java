package week10;

public class Phone {
	// 자식 객체가 가지는 공통된 속성과 기능을 선언
	// 부모 클래스
	
	// private 인 경우에는 상속이 않됨
	public String model;
	public String color;
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	public void sendVoice(String msg) {
		System.out.println("나 : " + msg);
	}
	public void receiveVoice(String msg) {
		System.out.println("너 : " + msg);
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
