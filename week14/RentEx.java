package week14;

public class RentEx {

	public static void main(String[] args) {
		HouseAgency houseA = new HouseAgency();
		House myHome = houseA.rent();
		myHome.turnOnLight();
		
		CarAgency carA = new CarAgency();
		Car mycar = carA.rent();
		mycar.run();
		
		ToyAgency toyA = new ToyAgency();
		Toy mytoy = toyA.rent();
		mytoy.play();
	}

}

// 출력
// 전등을 켭니다.
// 자동차가 달립니다.
// 장남감을 가지고 놉니다.
