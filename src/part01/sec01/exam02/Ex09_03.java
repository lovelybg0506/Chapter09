package part01.sec01.exam02;

class Car3{
	private String color; // default NULL
	private int speed;	// default 0
	
	void upSpeed(int value) {
		speed=speed+value;
	}

	void downSpeed(int value) {
		speed=speed-value;
	}
	
	String getColor() {
		return color;
	}
	
	int getSpeed() {
		return speed;
	}
	
	void setColor(String color1) { // set:저장 / 전역과 지역중 우선 순위는 지역
		this.color=color1;	// this. 는 자기자신 클래스를 말한다 (Car3에있는 String color 를 말하는것,)
	}

	void setSpeed(int speed1) {
		this.speed=speed1;
	}
	
}

public class Ex09_03 {

	public static void main(String[] args) {
		Car3 myCar1 = new Car3();
			
		myCar1.setColor("빨강");
		myCar1.setSpeed(30);
		
		System.out.println("자동차1의 색상은"+myCar1.getColor()+"이고,현재속도는 "+myCar1.getSpeed()+"km입니다");

	}

}
