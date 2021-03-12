package part01.sec01.exam02;

class Car { // 여기에는 public이 붙으면안된다.
	// field
	String color; // 애네는 클래스에서 선언된 field 다
	int speed; // 밑에있는 지역변수와 다름., class에선언된 int는 초기화시켜주지않아도 default값으로 0을 가진다.

	// method
	void upSpeed(int value) {
		speed = speed + value;
	}

	void downSpeed(int value) {
		speed = speed - value;
	}
} // class:설계도 ==> 사용하려면 객체로 만들어줘야한다.
//객체는 main에서 만들어준다.

public class Ex09_01 { // 클래스 이름옆에는 public이 붙어도되는데

	public static void main(String[] args) { // main() 메소드 :프로그램 실행 스타트
		Car myCar1 = new Car(); // 메소드호출은 ()를 써야한다.
		myCar1.color = "검정"; // myCar1(참조변수):실제 메모리주소를 참조한다, Car 객체
		myCar1.speed = 0;

		Car myCar2 = new Car();
		myCar2.color = "파랑";
		myCar2.speed = 0;

		Car myCar3 = new Car();
		myCar3.color = "빨강";
		myCar3.speed = 0;

		myCar1.upSpeed(30);
		System.out.println("자동차1의 색상은 : "+myCar1.color+"이며,현재 속도는"+myCar1.speed+"km입니다.");

		myCar2.upSpeed(60);
		System.out.println("자동차2의 색상은 : "+myCar2.color+"이며,현재 속도는"+myCar2.speed+"km입니다.");

		myCar3.upSpeed(0);
		System.out.println("자동차3의 색상은 : "+myCar3.color+"이며,현재 속도는"+myCar3.speed+"km입니다.");

		
	}
}
