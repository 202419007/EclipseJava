package week5;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = (int)(Math.random() * 99 + 1);
		int score;
		
		while(true) {
			System.out.print("숫자를 맞혀 보세요(1~100) >> ");
			score = sc.nextInt();
			if (score <= 100 && score >= 1) {
				if (score == num)
					break;
				
				if (score > num)
					System.out.println("숫자가 너무 큽니다.");
				else 
					System.out.println("숫자가 너무 작습니다.");
				
			} else
				System.out.println("1~100 사이의 값을 입력하세요");
		}
		
		System.out.printf("정답입니다. 랜덤 숫자는 %d입니다.", score);
		sc.close();
	}

}
