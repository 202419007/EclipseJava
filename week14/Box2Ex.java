package week14;

public class Box2Ex {

	public static void main(String[] args) {
		// String 값만 지정되는 box
		Box2<String> b1 = new Box2<String>();
		b1.setT("홍길동");
		//b1.setT(100);
		String sval = b1.getT();
		
		// 정수만 저장되는 box
		Box2<Integer> b2 = new Box2<Integer>();
		b2.setT(100);
		int ival = b2.getT();
	}

}
