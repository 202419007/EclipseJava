package week8;

public class StudentEx {

	public static void main(String[] args) {
		Student s = new Student("홍길동", 90, 85, 87);
		
		System.out.println(s.name + " : 총점 " + s.getTotal() + "점, 평균 " + s.getAve() + "점");
	}

}

// 출력 -> 홍길동 : 총점 262점, 평균 87.3점
