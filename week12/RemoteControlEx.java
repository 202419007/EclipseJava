package week12;

public class RemoteControlEx {

	public static void main(String[] args) {
		// 구현 클래스를 이용해서 구현 객체 생성
		Audio audio = new Audio();
		TV tv = new TV();
		
		// 생성된 구현객체로 메소드 호출
		audio.turnOn();
		audio.setVolume(5);
		audio.setMute(true);
		audio.setMute(false);
		audio.turnOff();
		
		System.out.println("---");
		tv.turnOn();
		tv.setVolume(3);
		tv.setMute(true);
		tv.setMute(false);
		tv.turnOff();
		
		System.out.println("---");
		RemoteControl.changeBattery();
		
		System.out.println("---");
		
		SmartTV smart = new SmartTV();
		smart.turnOn();
		smart.setVolume(3);
		smart.setMute(true);
		smart.search("네이버");
		smart.setMute(false);
		smart.turnOff();
		
		
		System.out.println("---");
		// 상수 필드 접근
		System.out.println("리모컨 최대 볼륨 : " + RemoteControl.MAX_VALUE);
		System.out.println("리모컨 최소 볼륨 : " + RemoteControl.MIN_VALUE);
		
		System.out.println("-- 인터페이스의 다형성 --");
		RemoteControl[] rc = new RemoteControl[3];
		rc[0] = audio;
		rc[1] = tv;
		rc[2] = smart;
		
		for(RemoteControl r : rc) {
			r.turnOn();
			r.setVolume(5);
			r.setMute(true);
			r.setMute(false);
			r.turnOff();
			System.out.println("---\n");
		}
	}

}

// 출력
// 오디오를 켭니다.
// Audio 무음 처리...
// 무음 처리 전 볼륨 = 5
// Audio 무음 해제~
// 무음 처리 후 볼륨 = 5
// 오디오를 끕니다.
// ---
// TV를 켭니다.
// 현재 TV 볼륨 : 3
// 무음 처리합니다.
// 현재 TV 볼륨 : 0
// 무음 해제합니다.
// TV를 끕니다.
// ---
// 리모컨 건전지 교환
// ---
// Smart TV를 켭니다.
// 무음 처리합니다.
// 네이버을 검색합니다.
// 무음 해제합니다.
// Smart TV를 끕니다.
// ---
// 리모컨 최대 볼륨 : 10
// 리모컨 최소 볼륨 : 0
// -- 인터페이스의 다형성 --
// 오디오를 켭니다.
// Audio 무음 처리...
// 무음 처리 전 볼륨 = 5
// Audio 무음 해제~
// 무음 처리 후 볼륨 = 5
// 오디오를 끕니다.
// ---

// TV를 켭니다.
// 현재 TV 볼륨 : 5
// 무음 처리합니다.
// 현재 TV 볼륨 : 0
// 무음 해제합니다.
// TV를 끕니다.
// ---

// Smart TV를 켭니다.
// 무음 처리합니다.
// 무음 해제합니다.
// Smart TV를 끕니다.
// ---
