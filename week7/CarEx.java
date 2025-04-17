package week7;

public class CarEx {

	public static void main(String[] args) {
		// 객체 생성
		Car mycar = new Car();
		
		// 필드 값 읽기
		// 필드값은 반드시 객체명을 통해서 접근
		System.out.println("제조회사:"+mycar.company);
		System.out.println("모델명:"+mycar.model);
		System.out.println("색 상:"+mycar.color);
		System.out.println("최고속도:"+mycar.maxSpeed);
		System.out.println("현재속도:"+mycar.speed);
		
		// 필드값 변경
		mycar.speed = 100;
		System.out.println("현재속도:"+mycar.speed);
		
		// 다른 객체 생성
		Car yourcar = new Car();
		System.out.println("제조회사:"+yourcar.company);
		System.out.println("모델명:"+yourcar.model);
		System.out.println("색 상:"+yourcar.color);
		System.out.println("최고속도:"+yourcar.maxSpeed);
		System.out.println("현재속도:"+yourcar.speed);
	}

}
