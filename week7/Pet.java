package week7;

public class Pet {
	// 필드 선언
	String name;
	String type;
	int age;
	String color;
	
	// 생성장의 매개변수를 이용해서 초기화
	Pet(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	Pet(String name, String type) {
		this.name = name;
		this.type = type;
		this.age = 0;
		this.color = "미정";
	}
	
	Pet(String name, String type, int age, String color) {
		this.name = name;
		this.type = type;
		this.age = age;
		this.color = color;
	}
}
