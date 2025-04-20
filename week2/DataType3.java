package week2;

public class DataType3 {
	public static void main(String[] args) {
		//byte : 1byte=8bit -128~127;
		//byte bData = 128;
		byte bData = 127;
		
		//char 음수가 없다
		//char cData = -90;
		char cData = 90;
		
		//float fData = 3.14;
		float fData = 3.14f;
		
		//long lData = 10000000000;
		long lData = 10000000000L;
		
		//boolean boolD = 10;
		boolean boolD = true;
		
		System.out.println("bData = " + bData);
		System.out.println("bData = " + cData);
		System.out.println("bData = " + fData);
		System.out.println("bData = " + lData);
		System.out.println("bData = " + boolD);
	}
}

// 출력
// bData = 127
// bData = Z
// bData = 3.14
// bData = 10000000000
// bData = true
