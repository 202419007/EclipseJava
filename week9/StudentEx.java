package week8;

public class StudentEx {

	public static void main(String[] args) {
		Student s = new Student("홍길동", 90, 85, 87);
		
		System.out.println(s.name + " : 총점 " + s.getTotal() + "점, 평균 " + s.getAve() + "점");
	}

}
