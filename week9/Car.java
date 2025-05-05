package week8;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;  // 값 적용
	}
	
	boolean isLeftGas() {
		if (gas == 0) {
//			System.out.println("gas가 없습니다.");
		}
		
//		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while (gas > 0) {
			System.out.println("달립니다. (gas잔량: "+gas+")");
			gas -= 1;  // gas--;
		}
		
		//gas = 0인 경우
		System.out.println("멈춥니다. (gas잔량: "+gas+")");
	}
}
