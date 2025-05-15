package week11;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		car.tire = new Tire();
		car.run();
		
		car.tire = new HankookTire();
		car.run();
		
		car.tire = new KumhoTire();
		car.run();
	}

}

// 출력
// 타이어 회전
// 한국타이어 회전
// 금호타이어 회전
