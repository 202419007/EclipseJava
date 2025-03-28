package week4;

import java.util.Scanner;

public class IfStudent {

	public static void main(String[] args) {
		// Scanner 객체 : 외부로부터 데이터값을 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 연도 입력 : ");
		
		int year = sc.nextInt();
		
		//System.out.println(year);
		
		int age = 2025 - year;
		
		//(age >= 20 && <= 26) X
		//( 20 <= age <= 26 ) X
		if (age >= 20 && age <= 26)
			System.out.println("대학생");
		else if (age >= 17 && age < 20)
			System.out.println("고등학생");
		else if (age >= 14 && age < 17)
			System.out.println("중학생");
		else if (age >= 8 && age < 14)
			System.out.println("초등학생");
		else
			// 8세 미만 이거나(||) 26세 초과 인 경우
			System.out.println("학생이 아닙니다");
		
		sc.close();
	}

}
