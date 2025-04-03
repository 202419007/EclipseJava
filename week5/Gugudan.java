package week5;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 몇 단을 계산할까요?");
		
		int num = sc.nextInt();
		
		System.out.printf("< 구구단 %d단 >\n", num);
		for(int i=1; i<=9; i++)
			System.out.printf("%d x %d = %d", num, i, num*i);
		
		sc.close();
	}

}
