package part01.sec01.exam02;

class Car4 {
	private int speed;

	public void upSpeed(int value) {
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
			System.out.println("현재 속도==>" + getSpeed());
		}
	}

	int getSpeed() {
		return speed;
	}
}

public class Ex09_04 {

	public static void main(String[] args) {
		Car4 myCar1 = new Car4();

	}

}
