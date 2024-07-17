package chapter2;

// 인터페이스 : 클래스가 구현해야하는 메서드들을 선언한 참조 타입
// 인터페이스의 모든 변수 public static final 형태가 와야함
// 인터페이스의 모든 메서드는 public abstract 형태가 와야함
// 인터페이스는 다중 구현이 가능

// 접근제어자 interface 인터페이스명 { ... }
interface AreaCalculation {
	
  /* public static final double PI = 3.14; //@@@@ 이유 알기
  	
  	public abstract double getTriangleArea(double bottom, double height);
  	public abstract double getRectangleArea(double bottom, double height);
  	public abstract double getCircleArea(double radius);
  	-> 생략가능 */
	
    double PI = 3.14;
	
	double getTriangleArea(double bottom, double height);
	double getRectangleArea(double bottom, double height);
	double getCircleArea(double radius);
	
	
}

interface CircumferenceCalculation {
	
	double getCircleCircumference(double radius);
}

// 인터페이스는 다중상속이 가능함
interface Calculation extends AreaCalculation, CircumferenceCalculation {
	
}

// 인터페이스는 implements 키워드를 이용하여 클래스에서 구현하여 사용할 수 있음
// 인터페이스는 다중 구현이 가능함
class MyCalculation implements 
    // AreaCalculation, CircumferenceCalculation { // ,뒤에 인터페이스명을 쓰면 다중구현 가능 왜? 구현체가 없기 때문에 다이아몬드 문제가 발생하지 않음
    Calculation {

	@Override
	public double getTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}

	@Override
	public double getRectangleArea(double bottom, double height) {
		return bottom * height;
	}

	@Override
	public double getCircleArea(double radius) {
		return radius * radius * PI;
	}

	@Override
	public double getCircleCircumference(double radius) {
		return 2 * radius * PI;
	}
	
}


// 인터페이스는 개발자간의 상호 약속을 위한 수단으로도 사용됨
interface Statement {
	String greet = "안녕하세요";
}

public class Interface {

	public static void main(String[] args) {
		
//		double pi = AreaCalculation.PI;
//		AreaCalculation.PI = 10;
		
		MyCalculation instance = new MyCalculation();
		instance.getCircleArea(10);
		
		System.out.println(Statement.greet);

	}

}
