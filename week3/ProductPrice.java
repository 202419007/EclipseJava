package week3;

public class ProductPrice {

	public static void main(String[] args) {
		// 상품 가격 계산하기
		//우유
		int m_cnt = 1;
		int m_price = 4500;
		//당근
		int c_cnt = 3;
		int c_price = 1000;
		//과자
		int s_cnt = 2;
		int s_price = 1500;
		
		//할인 전 상품 가격
		int total = m_cnt * m_price;
		total += c_cnt * c_price;
		total += s_cnt * s_price;
		System.out.println("할인 전 상품 가격 : " + total + "원");
		
		//할인 적용 : 10% => 10/100 => 0.1
		double discount = total * 0.1;
		System.out.println("할인 금액 : " + discount + "원");
		
		//최종 결제 금액 = 원래 금액 - 할인 금액
		double final_amt = total - discount;
		System.out.println("최종 금액 : " + final_amt + "원");
	}

}
