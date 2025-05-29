package week13;

public class BeepThreadEx {

	public static void main(String[] args) throws InterruptedException {
		// main 스레드
		// 작업 스레드 생성
		Thread thread = new BeepThread();
		thread.start();  // run()이 아닌 start()
		
		// main 작업
		for (int i=0; i<5; i++) {
			System.out.println("***");
			Thread.sleep(1000);
		}
	}

}

// 출력  // ***, 삐~ 이 둘이서 출력할 때마다 순서 계속 바뀜
// ***
// 삐~
// ***
// 삐~
// 삐~
// ***
// 삐~
// ***
// 삐~
// ***
