package week8;

public class Student {
	// 필드(속성)
	String name;
	int kor;
	int eng;
	int math;
	
	// 생성자
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 메소드(기능, 동작)
	int getTotal() {
		return kor + eng + math;
	}
	
	double getAve() {
		return getTotal() / 3.0;
	}
	
}
