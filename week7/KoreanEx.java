package week7;

public class KoreanEx {

	public static void main(String[] args) {
		// 실행 클래스
		// 객체 생성
		Korean k1 = new Korean("홍길동", "96062412301234", "010-1234-1234");
		System.out.println("k1.nation=" + k1.nation);
		System.out.println("k1.name=" + k1.name);
		System.out.println("k1.ssn=" + k1.ssn);
		System.out.println("k1.phone=" + k1.phone);
		
		Korean k2 = new Korean("이선애", "9606241234665", "010-1111-2222");
		System.out.println("k1.nation=" + k2.nation);
		System.out.println("k1.name=" + k2.name);
		System.out.println("k1.ssn=" + k2.ssn);
		System.out.println("k1.phone=" + k2.phone);
	}

}
