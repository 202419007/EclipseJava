package week3;

public class OneOperand1 {
	public static void main(String[] args) {
		//
		int iValue1 = 100;
		int iValue2 = -100;
		double dValue1 = 3.14;
		double dValue2 = -10.5;
		
		int result1 = +iValue1;
		int result2 = +iValue2;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("dValue1 = " + dValue1);
		System.out.println("dValue1 = " + dValue2);
		
		
		short sValue = 100;
		//int보다 크기가 작은 데이터 타입의 연산은 결과가 int 타입이다.
		//short sResult = -sValue;
		int sResult = -sValue;
		System.out.println("sValue = " + sValue);
		System.out.println("sResult = " + sResult);
		
		byte bValue = -100;
		int bResult = -bValue;
		System.out.println("bResult = " + bResult);
		
		long lValue = 100;
		long lResult = -lValue;
		System.out.println("lResult = " + lResult);
	}
}
