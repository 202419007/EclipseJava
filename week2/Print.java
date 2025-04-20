package week2;

public class Print {
	public static void main(String[] args) {
		//main 메소드 단축키 : main + ctrl+spacebar
		//main 메소드는 반드시 필요 => JVM main을 찾아서 실행 => 프로그램 실행의 시작점
		//출력 단축키 : sysout + ctrl+spacebar
		//실행 단축키 : ctrl+F11
		System.out.println("객체지향 프로그래밍");
	
		//주석 단축키 : ctrl + /
		System.out.println("/*객체지향*/ 프로그래밍");
	
		//숫자 출력 시 주의사항
		System.out.println(17 + 35);
		System.out.println("17 + 35 = " + (17 + 35));
	
		//다양한 출력 포맷
		//문자열 포맷(printf)
		//% : 프린트 포맷 기호
		//%s : 문자열 출력
		//%d : 정수 출력
		//%f : 실수 출력
		//\n : 줄바꿈
		System.out.printf("이름 : %s\n", "홍길동");
		System.out.printf("나이 : %d세\n", 25);
		
		System.out.printf("과목 : %s%s %s\n", "객체","지향", "프로그래밍");
	}
}

// 출력
// 객체지향 프로그래밍
// /*객체지향*/ 프로그래밍
// 52
// 17 + 35 = 52
// 이름 : 홍길동
// 나이 : 25세
// 과목 : 객체지향 프로그래밍
