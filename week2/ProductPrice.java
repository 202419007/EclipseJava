package week2;

public class ProductPrice {
	public static void main(String[] args) {
		int totalPrice = 5700;
		int cnt = 7;
		
		//단가 = 총 금액 / 개수
		// int/int => 결과도 int
		double aPrice = (double)totalPrice / cnt;
		
		System.out.printf("구매 수량 : %d개\n", totalPrice);
		System.out.printf("총 구매 금액 : %d원\n", cnt);
		System.out.printf("구매 수량 : %.1f원n", aPrice);
	}
}
