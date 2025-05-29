package week13;

public class RamenCookerEx {

	public static void main(String[] args) {
		// 멀티 스레드 생성
		RamenCooker guest1 = new RamenCooker("홍길동");
		guest1.start();
		
		RamenCooker guest2 = new RamenCooker("이순신");
		guest2.start();
		
		RamenCooker guest3 = new RamenCooker("강감찬");
		guest3.start();
	}
}

// 출력 : 순서가 바뀜
// 🍲홍길동 : 물을 끊이는 중...
// 🍲이순신 : 물을 끊이는 중...
// 🍜이순신 : 면을 넣는 중...
// 🍜홍길동 : 면을 넣는 중...
// 🍜강감찬 : 면을 넣는 중...
// 🥘홍길동 : 라면 완성~!
// 🥘강감찬 : 라면 완성~!
// 🥘이순신 : 라면 완성~!
