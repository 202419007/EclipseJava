package week5;

public class ForStar2 {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {  // 바깥쪽 루프(행)
			for(int j=1; j<=5; j++)  { // 안쪽 루프(열)
				System.out.printf("★ ");  //별 출력
			}
			System.out.println();
		}
	}

}
