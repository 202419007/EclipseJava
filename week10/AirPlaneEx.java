// 실행 클래스
package week10;

public class AirPlaneEx {

	public static void main(String[] args) {
		SonicAirPlane sPlane = new SonicAirPlane();
		sPlane.takeoff();
		sPlane.fly();
		sPlane.land();
		
		sPlane.flyMode = SonicAirPlane.SUPERSONIC;
		sPlane.fly();
	}

}

// 출력
// 이륙합니다.
// 일반비행합니다.
// 착륙합니다.
// 음속비행합니다.
