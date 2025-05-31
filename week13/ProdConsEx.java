package week13;

public class ProdConsEx {

	public static void main(String[] args) {
		// 공유 객체 생성
		DataBox dataBox = new DataBox();
		
		ProducerThread prod = new ProducerThread(dataBox);
		ConsumerThread cons = new ConsumerThread(dataBox);
		
		prod.start();
		cons.start();
	}

}

// 출력
// Producer Thread가 생성한 데이터 : Data-1
// Consumer Thread가 읽은 데이터 : Data-1
// Producer Thread가 생성한 데이터 : Data-2
// Consumer Thread가 읽은 데이터 : Data-2
// Producer Thread가 생성한 데이터 : Data-3
// Consumer Thread가 읽은 데이터 : Data-3
