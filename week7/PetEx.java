package week7;

public class PetEx {
	// 실행 클래스
	public static void main(String[] args) {
		Pet mypet = new Pet("바둑이", "강아지", 3);
		System.out.println("<애완동물 정보>");
		System.out.println("이름: " + mypet.type);
		System.out.println("종류: " + mypet.name);
		System.out.println("나이: " + mypet.age + "살");
		
		System.out.println();
		Pet pet1 = new Pet("초코", "고양이");
		System.out.println("<첫 번째 애완동물>");
		System.out.println("이름: " + pet1.type);
		System.out.println("종류: " + pet1.name);
		System.out.println("나이: " + pet1.age + "살");
		System.out.println("색상: " + pet1.color);
		
		System.out.println();
		Pet pet2 = new Pet("구름", "강아지", 2, "흰색");
		System.out.println("<두 번째 애완동물>");
		System.out.println("이름: " + pet2.type);
		System.out.println("종류: " + pet2.name);
		System.out.println("나이: " + pet2.age);
		System.out.println("색상: " + pet2.color);
	}

}
