package week8;

public class CalcEx {

	public static void main(String[] args) {
		Calculator c1 = new Calculator("white", "small");
		System.out.println(c1.color + ", " + c1.size);
		
		int result1 = c1.plus(10, 20);
		System.out.println("plus(10, 20) = " + result1);
		
		double result2 = c1.divide(10, 20);
		System.out.println("divide(10, 20) = " + result2);
		
		byte b1 = 10;
		byte b2 = 20;
		result2 = c1.divide(b1, b2);
		System.out.println("divide(10, 20 = " + result2);
		
		//double result3 = c1.avg(10, 7);
		//System.out.println("avg(10, 7) = " + result3);
		c1.exec();
		
		
		int sum1 = c1.sum1(new int[] {1,2,3,4,5});
		System.out.println("{1,2,3,4,5} = " + sum1);
		
		int sum2 = c1.sum2(1,2,3,4,5);
		System.out.println("(1,2,3,4,5) = " + sum2);
		
		// 정적(static) 필드는 객체를 생성하지 않아도 접근이 가능하다
		int radius = 8;
		double circleArea = Calculator.pi * radius * radius;
		System.out.printf("반지름이 %d인 원의 면적 = %.2f\n", radius, circleArea);
		
		int x = 8;
		int y = 7;
		// 정적(static) 메소드도 객체를 생성하지 않아도 접근이 가능하다
		System.out.printf("(%d,%d)의 합 = %d\n", x, y, Calculator.plus2(x, y));
		System.out.printf("(%d,%d)의 차 = %d\n", x, y, Calculator.minus(x, y));
	}
}
