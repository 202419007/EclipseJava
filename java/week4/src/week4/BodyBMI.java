package week4;

import java.util.Scanner;

public class BodyBMI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		
		System.out.print("키(cm)를 입력하세요 : ");
		int height = sc.nextInt();
		
		System.out.print("몸무게(kg)를 입력하세요 : ");
		int weight = sc.nextInt();
		
		double mHeight = height / 100.0;
		double bmi = weight / (mHeight*mHeight);
		
		String result = "";
		
		if (bmi >= 18.5 && bmi < 23) {
			result = "정상";
		}
		else if (bmi <= 23 && bmi < 25) {
			result = "과체중";
		}
		else if (bmi <= 25 && bmi < 30) {
			result = "비만";
		}
		else if (bmi >= 30) {
			result = "고도비만";
		}
		else {
			result = "저체중";
		}
		
		System.out.println(name+"님의 키는 "+height+"cm, 몸무게는 "+weight+"kg");
		System.out.printf("BMI 지수 = %.2f, %s", bmi, result);
		
		sc.close();
	}

}
