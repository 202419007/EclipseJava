package week13;

public class User2 extends Thread {
	private Calculator calc;
	
	public void setCalc(Calculator calc) {
		setName("User2");
		this.calc = calc;
	}
	
	// 작업 스레드 코딩
	@Override
	public void run() {
		try {
			calc.setMemory(50);
		} catch (InterruptedException e) {  }
	}
}
