package week12;

import java.util.Scanner;

public class SmartPhoneEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		
		SmartPhone sp = new SmartPhone();
		EarPhone ep = null;
		
		System.out.println("** 스마트폰으로 음악 재생하기 **");
		
		while(true) {
			System.out.print("\n연결할 이어폰 선택(1.Buds 2.AirPods 3.TonFree 4.종료) >> ");
			menu = sc.nextInt();
			
			if (menu == 4)
				break;
			
			if (menu == 1)
				ep = new Buds();
			else if (menu == 2)
				ep = new AirPods();
			else if (menu == 3)
				ep = new TonFree();
			
			sp.musicOn(ep);
			sp.musicOff(ep);
		}
		
		System.out.println("프로그램 종료");
		sc.close();
	}

}

// 출력
// ** 스마트폰으로 음악 재생하기 **

// 연결할 이어폰 선택(1.Buds 2.AirPods 3.TonFree 4.종료) >> 1

// Buds 이어폰 연결
// 삼성 Buds 음악 재생 중...
// 삼성 Buds 음악을 중지합니다.

// 연결할 이어폰 선택(1.Buds 2.AirPods 3.TonFree 4.종료) >> 2

// 새로 구입한 Apple AirPods 연결
// Apple AirPods 음악 재생 중~
// Apple AirPods 음악을 중지합니다.

// 연결할 이어폰 선택(1.Buds 2.AirPods 3.TonFree 4.종료) >> 3

// LG 블루투스 이어폰 톤프리 연결
// LG 톤프리 음악 재생 중~~
// LG 톤프리 음악을 중지합니다.

// 연결할 이어폰 선택(1.Buds 2.AirPods 3.TonFree 4.종료) >> 4
// 프로그램 종료

