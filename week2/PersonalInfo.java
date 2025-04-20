package week2;

public class PersonalInfo {
	public static void main(String[] args) {
		String name = "홍길동";
		int age = 20;
		double height = 175.5;
		char gender = 'F';
		boolean is_Student = true;
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "세");
		System.out.printf("키: %3.1fcm\n", height);
		System.out.printf("성별: %c\n", gender);
		System.out.println("학생 여부: " + is_Student);
	}
}

// 출력
// 이름: 홍길동
// 나이: 20세
// 키: 175.5cm
// 성별: F
// 학생 여부: true
