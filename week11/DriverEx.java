package week11;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle v = new Vehicle();
		driver.drive(v);
		
		driver.drive(new Bus());
		driver.drive(new Taxi());
	}

}

// 출력
// 차량이 달립니다.
// 버스가 달립니다.
// 택시가 달립니다.
