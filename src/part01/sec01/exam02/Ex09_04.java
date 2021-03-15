package part01.sec01.exam02;

class Car4 {
	private int speed;	//field,캡슐화( 외부로부터 보호)

	 void upSpeed(int value) { // method
		if (speed + value > 200) {
			speed = 200;
		} else {
			speed += value;
		}
		System.out.println("현재 속도 ==> " + getSpeed());
	}

	void downSpeed(int value) {
		if (speed - value < 0) {
			speed = 0;
		} else {
			speed -= value;
		}
		System.out.println("현재 속도 ==> " + getSpeed());
	}

	int getSpeed() {
		return speed;
	}
}

public class Ex09_04 {

	public static void main(String[] args) {
		Car4 myCar1 = new Car4();	// 객체 생성,
//		myCar1.speed=100; // private된 field라서 에러
		myCar1.upSpeed(100);
		myCar1.upSpeed(150);
		
		myCar1.downSpeed(50);
		myCar1.downSpeed(160);
		
		
	}

}
