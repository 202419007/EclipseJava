package week10;

public class SmartPhoneEx {

	public static void main(String[] args) {
		SmartPhone mine = new SmartPhone("갤럭시", "white");
		
		System.out.println("모델 : " + mine.getModel());
		System.out.println("색상 : " + mine.getColor());
		System.out.println("wifi : " + mine.isWifi());
		
		mine.bell();
		mine.sendVoice("Hello");
		mine.receiveVoice("홍길동입니다");
		mine.hangUp();
	}

}

// 출력
// Phone() 생성자 호출
// SmartPhone() 생성자 호출
// 모델 : null
// 색상 : white
// wifi : false
// 벨이 울립니다.
// 나 : Hello
// 너 : 홍길동입니다
// 전화를 끊습니다.
