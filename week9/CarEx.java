package week8;

import java.util.Scanner;

public class CarEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gasVal;
		
		Car mycar = new Car();
		mycar.setGas(5);
		
//		if (mycar.isLeftGas())
//			System.out.println("출발합니다.");
//		
//		mycar.run();
		
		while (mycar.isLeftGas()) {
			System.out.println("출발합니다.");
			mycar.run();
			
			System.out.print("gas를 주입하세요 >> ");
			gasVal = sc.nextInt();
			
			if (gasVal == 0)
				break;
			
			mycar.setGas(gasVal);
		}
		
		System.out.println("프로그램 종료");
		sc.close();
	}

}

// 출력
// 출발합니다.
// 달립니다. (gas잔량: 5)
// 달립니다. (gas잔량: 4)
// 달립니다. (gas잔량: 3)
// 달립니다. (gas잔량: 2)
// 달립니다. (gas잔량: 1)
// 멈춥니다. (gas잔량: 0)
// gas를 주입하세요 >> 3
// 출발합니다.
// 달립니다. (gas잔량: 3)
// 달립니다. (gas잔량: 2)
// 달립니다. (gas잔량: 1)
// 멈춥니다. (gas잔량: 0)
// gas를 주입하세요 >> 0
// 프로그램 종료
