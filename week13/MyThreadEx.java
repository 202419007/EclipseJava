package week13;

public class MyThreadEx {

	public static void main(String[] args) throws InterruptedException {
		// 멀티 스레드 객체 생성
		for (int i=0; i<100; i++) {
			MyThread thread = new MyThread(i);
			thread.start();
			thread.join();
		}
	}

}

// 출력
// 0번째 스레드입니다.
// 1번째 스레드입니다.
// 2번째 스레드입니다.
// 3번째 스레드입니다.
// 4번째 스레드입니다.
// 5번째 스레드입니다.
// 6번째 스레드입니다.
// 7번째 스레드입니다.
// 8번째 스레드입니다.
// 9번째 스레드입니다.
// 10번째 스레드입니다.
// 11번째 스레드입니다.
// 12번째 스레드입니다.
// 13번째 스레드입니다.
// 14번째 스레드입니다.
// 15번째 스레드입니다.
// 16번째 스레드입니다.
// 17번째 스레드입니다.
// 18번째 스레드입니다.
// 19번째 스레드입니다.
// 20번째 스레드입니다.
// 21번째 스레드입니다.
// 22번째 스레드입니다.
// 23번째 스레드입니다.
// 24번째 스레드입니다.
// 25번째 스레드입니다.
// 26번째 스레드입니다.
// 27번째 스레드입니다.
// 28번째 스레드입니다.
// 29번째 스레드입니다.
// 30번째 스레드입니다.
// 31번째 스레드입니다.
// 32번째 스레드입니다.
// 33번째 스레드입니다.
// 34번째 스레드입니다.
// 35번째 스레드입니다.
// 36번째 스레드입니다.
// 37번째 스레드입니다.
// 38번째 스레드입니다.
// 39번째 스레드입니다.
// 40번째 스레드입니다.
// 41번째 스레드입니다.
// 42번째 스레드입니다.
// 43번째 스레드입니다.
// 44번째 스레드입니다.
// 45번째 스레드입니다.
// 46번째 스레드입니다.
// 47번째 스레드입니다.
// 48번째 스레드입니다.
// 49번째 스레드입니다.
// 50번째 스레드입니다.
// 51번째 스레드입니다.
// 52번째 스레드입니다.
// 53번째 스레드입니다.
// 54번째 스레드입니다.
// 55번째 스레드입니다.
// 56번째 스레드입니다.
// 57번째 스레드입니다.
// 58번째 스레드입니다.
// 59번째 스레드입니다.
// 60번째 스레드입니다.
// 61번째 스레드입니다.
// 62번째 스레드입니다.
// 63번째 스레드입니다.
// 64번째 스레드입니다.
// 65번째 스레드입니다.
// 66번째 스레드입니다.
// 67번째 스레드입니다.
// 68번째 스레드입니다.
// 69번째 스레드입니다.
// 70번째 스레드입니다.
// 71번째 스레드입니다.
// 72번째 스레드입니다.
// 73번째 스레드입니다.
// 74번째 스레드입니다.
// 75번째 스레드입니다.
// 76번째 스레드입니다.
// 77번째 스레드입니다.
// 78번째 스레드입니다.
// 79번째 스레드입니다.
// 80번째 스레드입니다.
// 81번째 스레드입니다.
// 82번째 스레드입니다.
// 83번째 스레드입니다.
// 84번째 스레드입니다.
// 85번째 스레드입니다.
// 86번째 스레드입니다.
// 87번째 스레드입니다.
// 88번째 스레드입니다.
// 89번째 스레드입니다.
// 90번째 스레드입니다.
// 91번째 스레드입니다.
// 92번째 스레드입니다.
// 93번째 스레드입니다.
// 94번째 스레드입니다.
// 95번째 스레드입니다.
// 96번째 스레드입니다.
// 97번째 스레드입니다.
// 98번째 스레드입니다.
// 99번째 스레드입니다.
